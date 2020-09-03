package com.mycompagny.tennis.core.entity;

public class Joueur {
	
	private Integer id;
	private String nom;
	private String prenom;
	private Character sexe;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Character getSexe() {
		return sexe;
	}
	public void setSexe(Character sexe) {
		this.sexe = sexe;
	}
	
	
}
