package fr.univavignon.rodeo.api.impl;

public class Animal {
	private static Animal instance;
		
	private Animal(){}
		
	public static synchronized Animal getInstance() {
		return instance == null?new Animal():instance;
	}
}
