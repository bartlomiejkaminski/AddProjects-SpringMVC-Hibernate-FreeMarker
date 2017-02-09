package com.bartek.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true, length=5)
	private Integer id;
	
	@Column(name="NAME", length=20, nullable=true)
	private String name;
	
	@Column(name="SURNAME", length=20, nullable=true)
	private String surname;
	
	@Column(name="INDEX_STUDY", length=6, nullable=true)
	private Integer index;

	public Person() {
		
	}
	
	public Person(Integer id, String name, String surname, Integer index) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.index = index;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

}
