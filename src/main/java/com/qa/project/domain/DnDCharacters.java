package com.qa.project.domain;

import javax.persistence.Entity;

@Entity
public class DnDCharacters {
	private String name;
	private String race;
	private String job;
	private Integer Age;
	private Double hieght;
	private Double wieght;
	private String alignment;

	public DnDCharacters(String name, String race, String job, Integer age, Double hieght, Double wieght,
			String alignment) {
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

	public Double getHieght() {
		return hieght;
	}

	public void setHieght(Double hieght) {
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
		return "DnDCharacters [name=" + name + ", race=" + race + ", job=" + job + ", Age=" + Age + ", hieght=" + hieght
				+ ", wieght=" + wieght + ", alignment=" + alignment + "]";
	}

}
