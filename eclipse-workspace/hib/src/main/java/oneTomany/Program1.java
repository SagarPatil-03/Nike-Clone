package oneTomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Program1 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query q = em.createQuery("select bank from Bank bank where bank.name=:bname ");
		
		q.setParameter("bname", "SbI");
		
		Bank bank =(Bank)q.getResultList().get(0);
		
		List<Customer> customer = bank.getCustomer();
		
		Customer c1 = new Customer();
		c1.setId(5);
		c1.setName("Dinesh");
		c1.setPhoneno("4567");
		c1.setEmail("dinesh@gmail.com");
		
		bank.setCustomer(customer);
		
		et.begin();
		em.persist(c1);
		et.commit();
		
		
		System.out.println(bank);

	}

}
