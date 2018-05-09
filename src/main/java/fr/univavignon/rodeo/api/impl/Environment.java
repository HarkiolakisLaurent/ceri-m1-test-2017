package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {
	
	private int areas;
	private List<ISpecie> species;
	
	public Environment(String name, int areas, List<ISpecie> species){
		super(name);
		this.areas = areas; 
		this.species = new ArrayList<ISpecie>();
		this.species = species;
	}

	public int getAreas() {
		return this.areas;
	}

	public List<ISpecie> getSpecies() {
		return this.species;
	}

}
