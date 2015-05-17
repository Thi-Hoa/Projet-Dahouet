
package com.thihoa.dahouet.models;

public class Proprietaire extends Personne {

	public Proprietaire(String nom, String mail, String prenom) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
	}
	// Attributs de propriétaire
	private String telephone;
	private String adresse;
	
	//Getters et Setters
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	// Afficher information concernant l'objet
	@Override
	public String toString() {
		return "Proprietaire [telephone=" + telephone + ", adresse=" + adresse
				+ "]";
	}

}
