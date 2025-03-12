/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.hibernate.dao;

/**
 *
 * @author Tsila
 */



import com.project.hibernate.entity.Medecin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MedecinDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_role");

    public void ajouterMedecin(Medecin medecin) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(medecin);
        em.getTransaction().commit();
        em.close();
        System.out.println("Ajout : " + medecin);
        
    }

    public void modifierMedecin(Medecin medecin) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(medecin);
        em.getTransaction().commit();
        em.close();
    }

    public void supprimerMedecin(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Medecin medecin = em.find(Medecin.class, id);
        if (medecin != null) {
            em.remove(medecin);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Medecin> getAllMedecins() {
        EntityManager em = emf.createEntityManager();
        List<Medecin> medecins = em.createQuery("SELECT m FROM Medecin m ", Medecin.class).getResultList();
        em.close();
        System.out.println("tonga eto : " + medecins);
        return medecins;
    }
    
    public List<Medecin> chercherMedecins(String searchTerm) {
    EntityManager em = emf.createEntityManager();
    List<Medecin> medecins;
    try {
        medecins = em.createQuery(
            "SELECT m FROM Medecin m WHERE CAST(m.codemed AS string) LIKE :search OR m.nom LIKE :search", Medecin.class)
            .setParameter("search", "%" + searchTerm + "%")
            .getResultList();
    } catch (Exception e) {
        medecins = List.of(); // Retourne une liste vide en cas d'erreur
        System.err.println("Erreur de recherche : " + e.getMessage());
    } finally {
        em.close();
    }
    System.out.println("ty tena izy :"+medecins);
    return medecins;
}

}
