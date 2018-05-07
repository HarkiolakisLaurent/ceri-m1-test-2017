package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;

public class AnimalTest extends IAnimalTest {
	
	@Override
	public IAnimal getTestInstance() {
		return new Animal("toto",10,false,false,false);
	}
}
