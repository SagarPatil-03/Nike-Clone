package product;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.practice.Demo;

public class Dao {
	
    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public static void main(String[] args) {
        Dao p= new Dao();
        p.insert();
//        p.findById(1);
//        p.updatequantity();
        
      
    }

  void insert() {

	        LocalDate date = LocalDate.of(2025, 12, 23);

	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        Product p = new Product();
	        
	        p.setName("Laptop");
	        p.setPrice(20000);
	        p.setExDate(date);
	        p.setQuantity(2);

	        et.begin();
	        em.persist(p);
	        et.commit();

	        em.close();
	        
	    }
	 
	  void findById(int id) {
	        EntityManager em = emf.createEntityManager();

	        Product p = em.find(Product.class, id);
	        System.out.println(p);

	        em.close();
	    }
	
	void deleteBy(LocalDate date)
	{
		
	}
	
	void findByprice()
	{
		
	}
	 void findbyquantity(int quantity)
	 {

			    EntityManager em = emf.createEntityManager();

			    String jpql = "select p from Product p where p.quantity = :qty";
			    Query q = em.createQuery(jpql);
			    q.setParameter(1, quantity);

			    List<Product> list = q.getResultList();
			    list.forEach(System.out::println);

			    em.close();
			}
	 void updatequantity()
	 {
		    EntityManager em = emf.createEntityManager();
		   

		    String jpql = "select p from Product p where p.price =?1 and p.quantity=?2 ";
		    Query q = em.createQuery(jpql);
		    q.setParameter(1,2000.0);
		    q.setParameter(2, 3);
		   
		    
		  
	       List<Product> li = q.getResultList();
	       li.forEach(System.out::println);
	       

	        em.close();
		    
		 
		 
	 }
}
