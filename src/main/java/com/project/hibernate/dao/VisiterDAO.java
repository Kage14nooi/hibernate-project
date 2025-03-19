package com.project.hibernate.dao;

import com.project.hibernate.config.HibernateConfig;
import com.project.hibernate.entity.Visiter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class VisiterDAO {
    private HibernateConfig connexionDB = new HibernateConfig(); 
  private EntityManagerFactory emf = connexionDB.getEntityManagerFactory();

    public void ajouterRendezVous(Visiter visiter) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(visiter);
        em.getTransaction().commit();
        em.close();
    }

    public void modifierRendezVous(Visiter visiter) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(visiter);
        em.getTransaction().commit();
        em.close();
    }

    public void supprimerRendezVous(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Visiter visiter = em.find(Visiter.class, id);
        if (visiter != null) {
            em.remove(visiter);
        }
        em.getTransaction().commit();
        em.close();
    }

    public Visiter getById(int id) {
        EntityManager em = emf.createEntityManager();
        Visiter visiter = em.find(Visiter.class, id);
        em.close();
        return visiter;
    }

    public List<Visiter> getAllRendezVous() {
        EntityManager em = emf.createEntityManager();
        List<Visiter> visites = em.createQuery("SELECT v FROM Visiter v", Visiter.class).getResultList();
        em.close();
        return visites;
    }
    
    public List<Visiter> chercherVisites(String searchTerm) {
    EntityManager em = emf.createEntityManager();
    System.out.println("test 2 : " + searchTerm);
    List<Visiter> visites;
    try {
        visites = em.createQuery(
            "SELECT v FROM Visiter v WHERE CAST(v.id AS string) LIKE :search ", Visiter.class)
            .setParameter("search", "%" + searchTerm + "%")
            .getResultList();
    } catch (Exception e) {
        System.out.println("Error  : " + searchTerm);
        visites = List.of(); // Retourne une liste vide en cas d'erreur
        System.err.println("Erreur de recherche : " + e.getMessage());
    } finally {
        em.close();
    }
    System.out.println("ty tena izy :" + visites.getFirst().getMedecin().getNom());
    return visites;
}
    
    public Visiter getPatientByCodepat(int id) {
    EntityManager em = emf.createEntityManager();
    Visiter visiter = null;
    try {
        visiter = em.createQuery("SELECT v FROM visiter  WHERE v.id = :id",Visiter.class)
                    .setParameter("id", id)
                    .getSingleResult();
    } catch (Exception e) {
        System.err.println("Erreur lors de la récupération du patient avec id=" + id + " : " + e.getMessage());
    } finally {
        em.close();
    }
    return visiter;
}
}
