package com.bartek.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bartek.hibernate.model.Person;
import com.bartek.hibernate.model.Project;
import com.bartek.hibernate.util.HibernateUtil;

@Controller
public class AppController {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
			
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String index(){
		
		return "index";
	}
	
	@RequestMapping(path="/addproject/add", method=RequestMethod.POST)
	public String addProject(@ModelAttribute("person") Person person, Project project, Model model){
				
		Session session = sessionFactory.getCurrentSession();	
		
		Person p = new Person();
		p.setName(person.getName());
		p.setSurname(person.getSurname());
		p.setIndex(person.getIndex());
		
		Project pr = new Project();
		pr.setContent(project.getContent());
		
		try {
		session.beginTransaction();
		List<Person> listPersons = new ArrayList<Person>();
		listPersons.add(p);
		
		pr.setPersons(listPersons);
		
		session.save(pr);		
		session.save(p);		
		session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		return "redirect:/listprojects";
	}
	
	@RequestMapping(path="/addproject", method=RequestMethod.GET)
	public String start(){
		
		return "addproject";
	}
	
	@RequestMapping(path="/listprojects", method=RequestMethod.GET)
	public String getListProjects(Model model){
		
		Session session = sessionFactory.getCurrentSession();
		try {
		session.beginTransaction();
		
		List<Project> listProjects = new ArrayList<Project>();
		listProjects = session.createCriteria(Project.class).list();
		
		model.addAttribute("lists", listProjects);
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		return "listprojects";
	}
	
	@RequestMapping(path="/addperson", method=RequestMethod.GET)
	public String addPersonSite(Model model){
		
		Session session = sessionFactory.getCurrentSession();
		try {
		session.beginTransaction();
		
		List<Project> titleProjects = new ArrayList<Project>();
		titleProjects = session.createCriteria(Project.class).list();
		
		model.addAttribute("titleList", titleProjects);
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		return "addperson";
	}
	
	@RequestMapping(path="/addperson/add", method={RequestMethod.POST,RequestMethod.GET})
	public String addPersonForm(@RequestParam(value = "nameProject", required=false) String nameProject, @ModelAttribute("person") Person person, Project project, Model model){

		int idProject;
		List<Person> listPersons = new ArrayList<Person>();
		Session session = sessionFactory.getCurrentSession();	
		
		Person p = new Person();
		p.setName(person.getName());
		p.setSurname(person.getSurname());
		p.setIndex(person.getIndex());
		
		try {
		session.beginTransaction();
		
		List<Project> listProjects = new ArrayList<Project>();
		listProjects = session.createCriteria(Project.class).list();
		
		Project pr = new Project();
		
		for(Project pro : listProjects){
			if(pro.getContent().equals(nameProject)){
				idProject = (pro.getId() - 1);			
				pr = listProjects.get(idProject);		
				listPersons = listProjects.get(idProject).getPersons();
				listPersons.add(p);
				pr.setPersons(listPersons);
			}
		}
			
		session.saveOrUpdate(pr);		
		session.save(p);		
		session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
	
		return "redirect:/listprojects";
	}
}
