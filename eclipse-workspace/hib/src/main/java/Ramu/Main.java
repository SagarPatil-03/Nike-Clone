package Ramu;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Main {
	static  EntityManagerFactory emf =
              Persistence.createEntityManagerFactory("postgres");

       static EntityManager em = emf.createEntityManager();
      static EntityTransaction et = em.getTransaction();
	
//static EntityManager em = Connection.getEntityManager("postgres");
    public static void main(String[] args) {
    	
    	
    	
    	String sql1 = " Update car_info set engine_id =null where engine_id=:e";
    	 Query q = em.createNativeQuery(sql1);
    	 
    	 q.setParameter("e",1);
    	 
    		String sql2 = " Delete from engine_info where id=:e ";
       	 Query q2 = em.createNativeQuery(sql2);
       	 
    	 q2.setParameter("e", 0);
    	 
    	 em.getTransaction().begin();
    	 
    	 q.executeUpdate();
    	 q2.executeUpdate();
    	 em.getTransaction().commit();
    	 

 	
//   Engine e = new Engine();
//     e.setCc("1200");
//     e.setId(2);
//     e.setMilege("300");
//     
//     Car c = new Car();
//     c.setBrand("bmw");
//     c.setId(2);
//   
//   em.getTransaction().begin();
//   em.merge(e);
//   em.merge(c);
//   em.getTransaction().commit();
   
//    	Car c = new Car(Car.class,1);
//    	c.setBrand("skoda");
//    	em.merge(c);
//    	em.getTransaction().begin();
//    	em.getTransaction().commit();
    	
    	
  

       

        System.out.println("Data inserted successfully");
    }
    
    public  void findbyid(int id)
    {
    	 String jpql = "select c from Car c where c.brand=:a";
    	 Query q =  em.createQuery(jpql);
    	  q.setParameter("a", "BMW");
    	 
    }
    
    public static  void engineDetails(int id  )
    {
    	String jpql = "select e from Engine e";
   Query q = em.createQuery(jpql);
   List<Engine> li = q.getResultList();
 li.forEach(System.out::println);
    
    }
    
    public static void deleteEngineByCarNative(int engineId) {

        
        try {
            et.begin();

            Query q1 = em.createNativeQuery(
                "UPDATE car_info SET engine_id = NULL WHERE engine_id = :e");
            q1.setParameter("e", engineId);
            q1.executeUpdate();

            Query q2 = em.createNativeQuery(
                "DELETE FROM engine_info WHERE id = :e");
            q2.setParameter("e", engineId);
            q2.executeUpdate();

            et.commit();
            System.out.println("Engine deleted using native query");

             }
        
           catch (Exception e) {
           
            e.printStackTrace();
        }
    }


    	
    
}
