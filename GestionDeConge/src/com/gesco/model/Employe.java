package com.gesco.model;

import java.util.ArrayList;

public class Employe extends Utilisteur {
	
	private double solde;
	private ArrayList<Conge> listeDeConge;
	private Formulaire formulaire;
	private Justification justification;
	
	public Employe(){
		
	}
	
	public boolean prendreConge(Formulaire formulaire){
		return true;
	}
	
	public void modifierConge(Formulaire nouveauFormulaire){
		
	}
	
	public void annulerDemande(){
		
	}
	
	

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public ArrayList<Conge> getListeDeConge() {
		return listeDeConge;
	}

	public Formulaire getFormulaire() {
		return formulaire;
	}

	public Justification getJustification() {
		return justification;
	}
	
	

}
