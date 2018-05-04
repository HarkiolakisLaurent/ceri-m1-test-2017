package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class SpecieTest extends ISpecieTest {
	
	private ISpecie specie;
	
	@Before
	public void setUp() {
		//specie 
	}
	
	@Test
	public void testGetArea() {
		//assertEquals(specie.getArea(),1);
		assertEquals(0,0);
	}
	
	@Test
	public void testGetAnimals() {
		//assertEquals(specie.getAnimals(),animals);
		assertEquals(0,0);
	}
	
}
