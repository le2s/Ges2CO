package com.gesco.model;

import java.util.ArrayList;

public class Employe  {
	
	private double solde;
	private ArrayList<Conge> listeDeConge;
	private Formulaire formulaire;
	private ArrayList<CongeJustifier> listeDeCongeJustifier;
	
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

	public ArrayList<CongeJustifier> getListeDeCongeJustifier() {
		return listeDeCongeJustifier;
	}

	public void setListeDeCongeJustifier(
			ArrayList<CongeJustifier> listeDeCongeJustifier) {
		this.listeDeCongeJustifier = listeDeCongeJustifier;
	}
	
	
	

}
