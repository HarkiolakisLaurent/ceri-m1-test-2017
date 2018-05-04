package fr.univavignon.rodeo.api.impl;

public class NamedObject {
	private static NamedObject instance;
		
	private NamedObject(){}
		
	public static synchronized NamedObject getInstance() {
		return instance == null?new NamedObject():instance;
	}
}
