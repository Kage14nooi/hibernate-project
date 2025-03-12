/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.hibernate.dao;

/**
 *
 * @author Tsila
 */

import com.project.hibernate.entity.Visiter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class VisiterDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_role");

    public void ajouterRendezVous(Visiter rdv) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(rdv);
        em.getTransaction().commit();
        em.close();
    }

    public void modifierRendezVous(Visiter rdv) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(rdv);
        em.getTransaction().commit();
        em.close();
    }

    public void supprimerRendezVous(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Visiter rdv = em.find(Visiter.class, id);
        if (rdv != null) {
            em.remove(rdv);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Visiter> getAllRendezVous() {
        EntityManager em = emf.createEntityManager();
        List<Visiter> rdvs = em.createQuery("SELECT r FROM Visiter r", Visiter.class).getResultList();
        em.close();
        return rdvs;
    }
}
