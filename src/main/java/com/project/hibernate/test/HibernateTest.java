package com.project.hibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.project.hibernate.config.HibernateConfig;

public class HibernateTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = HibernateConfig.getEntityManagerFactory();
        EntityManager em = factory.createEntityManager();

        System.out.println("✅ Connexion réussie !");
        em.close();
        HibernateConfig.closeFactory();
    }
}
