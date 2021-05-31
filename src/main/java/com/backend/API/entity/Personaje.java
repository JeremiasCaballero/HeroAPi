package com.backend.API.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Personaje {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String image;
	@NotEmpty(message="name is mandatory")
	private String name;
	private int age;
	private String history;
	
	
	public Personaje(long id, String image, String name, int age, String history) {
		this.image = image;
		this.name = name;
		this.age = age;
		this.history = history;
	}
	
	public Personaje() {
		
	}
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	 @JoinTable(
	   name = "participa",
      joinColumns = @JoinColumn(name = "FK_CHARACTER", nullable = false),
      inverseJoinColumns = @JoinColumn(name="FK_SERIE", nullable = false))
	 private List<Serie> series;
}
