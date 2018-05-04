package fr.univavignon.rodeo.api.impl;

public class Environment {
	private static Environment instance;
		
	private Environment(){}
		
	public static synchronized Environment getInstance() {
		return instance == null?new Environment():instance;
	}
}
