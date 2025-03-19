/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.hibernate.dao;

/**
 *
 * @author Tsila
 */

import com.project.hibernate.config.HibernateConfig;
import com.project.hibernate.entity.Patient;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PatientDAO {
    private HibernateConfig connexionDB = new HibernateConfig(); 
  private EntityManagerFactory emf = connexionDB.getEntityManagerFactory();

    public void ajouterPatient(Patient patient) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
        em.close();
    }

    public void modifierPatient(Patient patient) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(patient);
        em.getTransaction().commit();
        em.close();
    }

    public void supprimerPatient(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Patient patient = em.find(Patient.class, id);
        if (patient != null) {
            em.remove(patient);
        }
        em.getTransaction().commit();
        em.close();
    }

    public Patient chercherPatientParId(int id) {
        EntityManager em = emf.createEntityManager();
        Patient patient = em.find(Patient.class, id);
        em.close();
        return patient;
    }

    public List<Patient> chercherPatientParNom(String nom) {
        EntityManager em = emf.createEntityManager();
        List<Patient> patients = em.createQuery("SELECT p FROM Patient p WHERE p.nom LIKE :nom", Patient.class)
                .setParameter("nom", "%" + nom + "%")
                .getResultList();
        em.close();
        return patients;
    }

    public List<Patient> getAllPatients() {
        EntityManager em = emf.createEntityManager();
        List<Patient> patients = em.createQuery("SELECT p FROM Patient p", Patient.class).getResultList();
        em.close();
        return patients;
    }
    
    public List<Patient> chercherPatients(String searchTerm) {
    EntityManager em = emf.createEntityManager();
    List<Patient> patients;
    try {
        patients = em.createQuery(
            "SELECT p FROM Patient p WHERE CAST(p.codepat AS string) LIKE :search OR p.nom LIKE :search", Patient.class)
            .setParameter("search", "%" + searchTerm + "%")
            .getResultList();
    } catch (Exception e) {
        patients = List.of(); // Retourne une liste vide en cas d'erreur
        System.err.println("Erreur de recherche : " + e.getMessage());
    } finally {
        em.close();
    }
    System.out.println("ty tena izy :" + patients);
    return patients;
}

    public Patient getPatientByCodepat(int codepat) {
    EntityManager em = emf.createEntityManager();
    Patient patient = null;
    try {
        patient = em.createQuery("SELECT p FROM Patient p WHERE p.codepat = :codepat",Patient.class)
                    .setParameter("codepat", codepat)
                    .getSingleResult();
    } catch (Exception e) {
        System.err.println("Erreur lors de la récupération du patient avec codepat=" + codepat + " : " + e.getMessage());
    } finally {
        em.close();
    }
    return patient;
}

}

