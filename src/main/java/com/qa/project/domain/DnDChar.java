package com.qa.project.domain;

import javax.persistence.Entity;

@Entity
public class DnDChar {
	private String name;
	private String race;
	private String job;
	private Integer Age;
	private Integer hieght;
	private Double wieght;
	private String alignment;

	public DnDChar(String name, String race, String job, Integer age, Integer hieght, Double wieght, String alignment) {
		super();
		this.name = name;
		this.race = race;
		this.job = job;
		Age = age;
		this.hieght = hieght;
		this.wieght = wieght;
		this.alignment = alignment;
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
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	public Integer getHieght() {
		return hieght;
	}

	public void setHieght(Integer hieght) {
		this.hieght = hieght;
	}

	public Double getWieght() {
		return wieght;
	}

	public void setWieght(Double wieght) {
		this.wieght = wieght;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	@Override
	public String toString() {
		return "Character: Name: " + name + ", Race: " + race + ", Class: " + job + ", Age: " + Age + ", Hieght(cm): "
				+ hieght + ", Wieght(kg): " + wieght + ", Alignment: " + alignment;
	}

}
