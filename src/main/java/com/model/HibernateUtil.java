package com.model;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			try {
				StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			    Metadata md=new MetadataSources(sr).buildMetadata();
				sessionFactory=md.buildSessionFactory();
				
			}
			catch(HibernateException h) {
				h.printStackTrace();
			}
		}
	
	return sessionFactory;
	}


}
