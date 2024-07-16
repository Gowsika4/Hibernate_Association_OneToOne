package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Test {
  public static void main(String args[]) {
	 Transaction tr=null;
	  
	  try(Session ses=HibernateUtil.getSessionFactory().openSession()){
		  tr=ses.beginTransaction();
		  Employee e=new Employee();
		  e.setName("Ramesh");
		  		 e.setEmail("ramesh2gmail.com");
		  		Address a=new Address("VSB College","Covai road","karur",639105);
		  		e.setAdr(a);
		  		a.setE(e);  
		  		ses.persist(e);
		  		//ses.persist(a);
		  		tr.commit();
		  		ses.close();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  
	  }
  }
}
