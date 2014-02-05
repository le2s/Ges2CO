package com.gesco.model;

public class Conge {
	
	private Formulaire formulaire;
	private EtatConge etat;
	
	public Conge(Formulaire form){
		formulaire=form;
		etat=EtatConge.EnAttente;		
	}
	

	public Formulaire AvoirFormulaire() {
		return formulaire;
	}

	public void ModifierFormulaire(Formulaire formulaire) {
		this.formulaire = formulaire;
	}

	public EtatConge getEtat() {
		return etat;
	}

	public void setEtat(EtatConge etat) {
		this.etat = etat;
	}
	
	
	
}
