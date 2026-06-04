package pass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

	public static void main(String args[])
	{
		
		
		
	   
		
	}
	
	

}
