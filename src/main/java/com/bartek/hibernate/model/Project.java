package com.bartek.hibernate.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false, length=5)
	private Integer id;
	
	@Column(name="CONTENT", length=200, nullable=true)
	private String content;
	
	@Column(name="DATE_", nullable=true)
	private String date;
	
	@ElementCollection
	@OneToMany()
	private List<Person> persons;

	public Project() {
		
	}
	
	public Project(Integer id, String content, String date, List<Person> persons) {
		super();
		this.id = id;
		this.content = content;
		this.date = date;
		this.persons = persons;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
}
