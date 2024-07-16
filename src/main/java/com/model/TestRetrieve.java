
package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestRetrieve {
  public static void main(String args[]) {
	 Transaction tr=null;
     	try(Session ses=HibernateUtil.getSessionFactory().openSession()){
	   tr=ses.beginTransaction();
	
	Query<Employee>qry=ses.createQuery("from Employee",Employee.class);
	List<Employee> li=qry.list();
			for(Employee e:li) {
				System.out.println(e.getEmpId()+"\t"+e.getName()+"/t"+e.getEmail());
				Address ad=e.getAdr();
				System.out.println("Address is "+ad.getLine1()+ad.getLine2()+ad.getLine3());
			}
			tr.commit();
			ses.close();
}
   catch(Exception e) {
	 e.printStackTrace();}
   

}
}
