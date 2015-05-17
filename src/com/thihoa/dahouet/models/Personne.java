

package com.thihoa.dahouet.models;


// author Pham Thi-Hoa

public class Personne {

	public static boolean test;
	// Attributs de personne
	String nom;
	String mail;
	String prenom;
	//private static boolean test;

	// Getters et Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne(String nom, String mail, String prenom) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.prenom = prenom;

	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";

	}

	
		
	}

	
