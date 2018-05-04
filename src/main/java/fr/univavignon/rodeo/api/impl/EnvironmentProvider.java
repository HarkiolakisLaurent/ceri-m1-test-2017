package fr.univavignon.rodeo.api.impl;

public class EnvironmentProvider {
	private static EnvironmentProvider instance;
		
	private EnvironmentProvider(){}
		
	public static synchronized EnvironmentProvider getInstance() {
		return instance == null?new EnvironmentProvider():instance;
	}
}
