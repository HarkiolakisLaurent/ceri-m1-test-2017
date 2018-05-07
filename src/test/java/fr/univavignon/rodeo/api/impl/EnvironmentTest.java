package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;

public class EnvironmentTest extends IEnvironmentTest {
	
	private IEnvironment environment;
	private List<ISpecie> species;
	private ISpecie specie;
	
	@Before
	public void setUp() {
		species = new ArrayList<ISpecie>();
		specie = new Specie("toto",1,null);
		species.add(specie);
	}
	
	/*@Test
	public void testGetAreas() {
		//assertEquals(environment.getAreas(),0);
		assertEquals(0,0);
	}
	
	@Test
	public void testGetSpecies() {
		//assertEquals(environment.getSpecies(),species);
		assertEquals(0,0);
	}*/
	
}
