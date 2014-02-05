package com.gesco.model;

public class CongeJustifier {
	
	private Conge conge;
	private Justification justification;
	
	public CongeJustifier(Conge c,Justification j){
		conge=c;
		justification=j;
	}

	public Conge getConge() {
		return conge;
	}

	public Justification getJustification() {
		return justification;
	}
	
	

}
