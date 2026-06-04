package oneTomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String args[])
	{
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		 
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Customer c1 = new Customer();
		c1.setId(3);
		c1.setName("Abhishek");
		c1.setPhoneno("420");
		c1.setEmail("abhishek@gmail.com");
		
		Customer c2 = new Customer();
		c2.setId(4);
		c2.setName("Vaibhav");
		c2.setPhoneno("320");
		c2.setEmail("Vaibhav@gmail.com");
		
		
		Bank b = new Bank();
		b.setId(200);
		b.setName("SbI");
		b.setLoc("Pune");
		b.setPin("421062");
		b.setCustomer(List.of(c1,c2));
		
		
		et.begin();
		em.persist(b);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
		
		
		
	}

}
