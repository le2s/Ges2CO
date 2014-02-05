package com.gesco.model;

import java.util.Date;

public class Formulaire {
	
	private Date dateDebut;
	private Date dateFin;
	private Categorie categorie;
	
	public Formulaire(Date dd,Date df,Categorie cat){
		dateDebut=dd;
		dateFin=df;
		categorie=cat;
	}
	
	public Formulaire(Formulaire f){
		this.dateDebut=f.dateDebut;
		this.dateFin=f.dateFin;
		this.categorie=f.categorie;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void modifierDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void modifierDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void modifierCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	

}
