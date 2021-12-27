package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity

public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable= false, updatable= false)
	
	private Integer id;
	private String description;
	private String name;
	private Integer year;
	private String gender;
	private String classified;
	private Integer rate;
	private Double duration;
	
	public Movie() {
		
	}

	public Movie(Integer id, String description, String name, Integer year, String gender, String classified, Integer rate,
			Double duration) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.year = year;
		this.gender = gender;
		this.classified = classified;
		this.rate = rate;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}

	public void setId(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassified() {
		return classified;
	}

	public void setClassified(String classified) {
		this.classified = classified;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	

}
