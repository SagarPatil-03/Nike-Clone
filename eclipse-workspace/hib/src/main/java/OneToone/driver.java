package OneToone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class driver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e = new Engine();
		e.setCc("2200");
		e.setMileage("22");
		
		Car c = new Car();
		c.setBrand("bmw");
		c.setId(101);
		c.setEngine(e);
		
		
	}

}
