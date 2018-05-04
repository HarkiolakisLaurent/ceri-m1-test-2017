package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.INamedObject;

public class NamedObject implements INamedObject {
	private String name; 

	public NamedObject(String name) {this.name = name;}

	public String getName() {return this.name;}
}
