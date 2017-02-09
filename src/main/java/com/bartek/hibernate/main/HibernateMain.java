package com.bartek.hibernate.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bartek.hibernate.model.Person;
import com.bartek.hibernate.model.Project;
import com.bartek.hibernate.util.HibernateUtil;

public class HibernateMain {
	

	public static void main(String[] args) {
		
				//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		
		Person person1 = new Person();
		person1.setName("BartQfdfdfdaaa222");
		person1.setSurname("Kaminfddfdfsaaaaa222");
		person1.setIndex(140050);
		
		session.beginTransaction();
		
		Project project1 = new Project();
		project1 = (Project)session.get(Project.class, 2);
		
		List<Person> listPersons = new ArrayList<Person>();
		listPersons = project1.getPersons();
		listPersons.add(person1);
		
		
		
		
		project1.setPersons(listPersons);
		

		
		//start transaction
		
		session.save(project1);	
		
		session.save(person1);
		
		session.getTransaction().commit();
        
		sessionFactory.close();
	}

}