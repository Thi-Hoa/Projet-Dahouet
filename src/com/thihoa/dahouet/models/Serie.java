/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThiHoa.dahouet.models;

/**
 *
 * @author T
 */
;

public class Serie {

	protected String nomSerie;
	protected int idSerie;

	
	

	public Serie(String nomSerie, int idSerie) {
		super();
		this.nomSerie = nomSerie;
		this.idSerie = idSerie;
	}

	public String getNomSerie() {
		return nomSerie;
	}

	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}
	
	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	@Override
	public String toString() {
		return idSerie + " : " +nomSerie ;
	}
	
	
}
