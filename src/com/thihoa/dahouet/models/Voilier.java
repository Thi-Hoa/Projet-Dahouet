
package com.ThiHoa.dahouet.models;

/**
 *
 * @author T
 */


public class Voilier {
	
protected String nom;

    @Override
    public String toString() {
        return "Voilier{" + "nom=" + nom + '}';
    }





public Voilier(String nom) {
	super();
	this.nom = nom;
	
	
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}

}

