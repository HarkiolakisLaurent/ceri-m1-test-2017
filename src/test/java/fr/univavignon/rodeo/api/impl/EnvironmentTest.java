package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

public class EnvironmentTest extends IEnvironmentTest {
	
	@Override
	public IEnvironment getTestInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.setUp());				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(ISpecieTest.setUp());
		return new Environment("Environment1",1,species) ;
	}
	
}
