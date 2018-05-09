package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {
	
	private int area;
	private List<IAnimal> animals;
	
	public Specie(String name, int area, List<IAnimal> animals){
		super(name);
		this.area = area ; 
		this.animals= new ArrayList<IAnimal>() ; 
		this.animals = animals ; 
	}
	
	public int getArea() {
		return this.area;
	}

	public List<IAnimal> getAnimals() {
		return this.animals;
	}
}
