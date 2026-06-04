package oneTomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Program2 {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		String sql1 = " delete from bank_info_cust_info where customer_id=:a";
		String sql2 ="delete from cust_info where id=:a";
		
		 Query q1=em.createNativeQuery(sql1);
		 
		 q1.setParameter("a",4);
		 
         Query q2=em.createNativeQuery(sql2);
		 
		 q2.setParameter("a",2);
		 
		 
		 et.begin();
		 
		 q1.executeUpdate();
		 q2.executeUpdate();
		 et.commit();
		 
	                     
	                     
	}

}
