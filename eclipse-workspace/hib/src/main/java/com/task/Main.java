package com.task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
    	
    	

    }
    
    public static void inservalue()
    {
    	 User u = new User();
         u.setId(1);
         u.setUsername("Abhay");
         u.setEmail("Abhay@123");

         UserProfile us = new UserProfile();
         us.setId(1);
         us.setAdd("At bhusawal");
         us.setPhn("9071873738");

      
         us.setUser(u);
         u.setUserp(us);

         EntityTransaction et = em.getTransaction();
         
         
         et.begin();

        
         em.persist(u); 
         em.persist(us);

         et.commit();

         System.out.println("value inserted");

         em.close();
         emf.close();
    }
}
