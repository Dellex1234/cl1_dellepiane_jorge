package pe.edu.I202330006.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.I202330006.entity.country;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_JD");
        EntityManager em = emf.createEntityManager();

        country country = new country("RMS","rarmondis","Oceania","Costera",3500.00,1860,25480,87.5,75.15,95.68,"raridiano","Democrático","Risputan",185679,"RZ",null,null);

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
    }
}
