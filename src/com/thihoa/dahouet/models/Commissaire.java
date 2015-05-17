package com.thihoa.dahouet.models;

public class Commissaire extends Personne {

	public Commissaire(String nom, String mail, String prenom) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
	}

	private String comite;

	public String getComite() {
		return comite;
	}

	public void setComite(String comite) {
		this.comite = comite;
	}
	
}

