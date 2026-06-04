package com.practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

    public static void main(String[] args) {

        
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();


//    position parameter
//        String jpql = "select e from Employee e where e.id=?1";
        
        // variable parameter;
        
        String jpql = "select  e from Employee e where e.id=:a";
        Query query = em.createQuery(jpql);
    query.setParameter("a", 1);
        List list = query.getResultList();



        list.forEach(System.out::println);


    }
}
