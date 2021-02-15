package com.deelu.simplilearn.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        Get a Reference to the SessionFactory object
    	SessionFactory theFactory = new Configuration()
    								.configure("hibernateConfig.xml")
    								.addAnnotatedClass(Person.class)//if you have multiple tables add here after creating separate entity class for each
    								.buildSessionFactory();
    	
//    	Get a reference to the Session object
    	Session theSession = theFactory.getCurrentSession();
    	
    	try {
//    		We will write the code here to add/fetch java objects
    		//
    		
    		Person thePerson =new Person("Privin","135 Test addrees");
    		
    		theSession.beginTransaction();
    		theSession.save(thePerson);
    		theSession.getTransaction().commit();
    		
    		
    		//System.out.println("Set up now to work with Hibernate to make our lives easier ...");
    	}finally {
    		theFactory.close();
    	}
    }
}