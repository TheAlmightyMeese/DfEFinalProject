package com.qa.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DnDChar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String race;
	private String job;
	private Integer age;
	private Integer height;
	private Double weight;
	private String alignment;

	public DnDChar(String name, String race, String job, Integer age, Integer height, Double weight, String alignment) {
		super();
		this.name = name;
		this.race = race;
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.alignment = alignment;
	}

	public DnDChar(Integer id, String name, String race, String job, Integer age, Integer height, Double weight,
			String alignment) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.alignment = alignment;
	}

	public DnDChar() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	@Override
	public String toString() {
		return "Character: Name: " + name + ", Race: " + race + ", Class: " + job + ", Age: " + age + ", Height(cm): "
				+ height + ", Weight(kg): " + weight + ", Alignment: " + alignment;
	}

}
