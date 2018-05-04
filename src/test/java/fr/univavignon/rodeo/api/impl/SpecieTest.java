package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.ISpecieTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class SpecieTest extends ISpecieTest {

	@Before
	public void setUp() {
		Mockito.when(getTestInstance().getArea()).thenReturn(1);
		for (int i = 0;i<3;i++)
			animals.add(animal);
		Mockito.when(getTestInstance().getAnimals()).thenReturn(animals);
	}

}
