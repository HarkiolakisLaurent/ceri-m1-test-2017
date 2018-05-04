package fr.univavignon.rodeo.api.impl;

public class Specie {
	private static Specie instance;
		
	private Specie(){}
		
	public static synchronized Specie getInstance() {
		return instance == null?new Specie():instance;
	}
}
