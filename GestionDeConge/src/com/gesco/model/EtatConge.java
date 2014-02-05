package com.gesco.model;

public enum EtatConge {
	
	Accepter("Accepter"),
	Refuser("Refuser"),
	EnAttente("En Attente"),
	NonJustifier("Non Justifier"),
	Justifier("Justifier");
	
	String etat="";
	
	EtatConge(String s){
		etat = s;
	}
	
	public String toString(){
		return etat;
	}

}
