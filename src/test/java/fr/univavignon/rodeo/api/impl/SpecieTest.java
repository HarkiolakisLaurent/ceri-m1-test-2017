package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

public class SpecieTest extends ISpecieTest {
	
	@Override
	public ISpecie getTestInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.setUp());
		return new Specie("Specie1",10,animals) ;
	}
	
}
