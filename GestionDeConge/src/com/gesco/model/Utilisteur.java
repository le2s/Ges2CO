package com.gesco.model;

public abstract class Utilisteur {
	
	private String ID;
	private String nom;
	@SuppressWarnings("unused")
	private String motDePasse;
	
	public boolean seConnecter(){
		return true;
	}
	public boolean seDeconnecter(){
		return true;
	}
	public String getID() {
		return ID;
	}
	public String getNom() {
		return nom;
	}
	
	

}
