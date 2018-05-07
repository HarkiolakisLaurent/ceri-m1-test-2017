package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class SpecieTest extends ISpecieTest {
	
	@Override
	public  ISpecie getTestInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.setUp());
		return new Specie("Specie1",10,animals) ;
	}
	
}
