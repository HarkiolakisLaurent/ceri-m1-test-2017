package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironmentTest;

public class EnvironmentTest extends IEnvironmentTest {
	
	@Before
	public void setUp() {
		Mockito.when(getTestInstance().getAreas()).thenReturn(5);
		for (int i = 0;i<3;i++)
			species.add(specie);
		Mockito.when(getTestInstance().getSpecies()).thenReturn(species);
	}

}
