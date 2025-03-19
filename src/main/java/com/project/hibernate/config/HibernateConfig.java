package com.project.hibernate.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lombok.Getter;
import lombok.Setter;

/*
@Getter
@Setter
public class HibernateConfig {
    private EntityManagerFactory factory;

    public HibernateConfig() {
        this.factory = Persistence.createEntityManagerFactory("user_role");
    }
}*/
@Getter
@Setter
public class HibernateConfig {
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_role");

    public static EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }

    public static void closeFactory() {
        if (factory != null) {
            factory.close();
        }
    }
}
