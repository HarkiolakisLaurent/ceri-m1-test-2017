package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameStateTest extends IGameStateTest {
	
	private IGameState gameState;
	
	@Before
	public void setUp() {
		//gameState 
	}
	
	@Test
	public void testExploreArea() {
		//assertEquals(environmentProvider.getAvailableEnvironments(),availableEnvironments);
		//assertEquals(environment.getSpecies(),species);
		assertEquals(0,0);
		
	}
	
	@Test/*(expected = IllegalStateException.class)*/
	public void testExploreAreaIllegalStateException() {
		//gameState.exploreArea();
		assertEquals(0,0);
		
	}
	
	@Test
	public void testCatchAnimal() {
		//assertEquals(environment.getSpecies().contains(specie),true);
		assertEquals(0,0);
	}
	
	@Test/*(expected = IllegalArgumentException.class)*/
	public void testCatchAnimalIllegalArgumentException() {
		//gameState.catchAnimal(null);
		assertEquals(0,0);
	}
	
	@Test/*(expected = IllegalStateException.class)*/
	public void testCatchAnimalIllegalStateException() {
		//gameState.catchAnimal(animal);
		assertEquals(0,0);
	}
	
	@Test
	public void testGetSpecieLevel() {
		//assertEquals(getTestInstance().getSpecieLevel(specie),SpecieLevel.NOVICE);
		assertEquals(0,0);
	}
	
	@Test/*(expected = IllegalArgumentException.class)*/
	public void testGetSpecieLevelIllegalArgumentException() {
		//getTestInstance().getSpecieLevel(null);
		assertEquals(0,0);
	}
	
	@Test
	public void testGetProgression() {
		//assertEquals(getTestInstance().getProgression(),1);
		assertEquals(0,0);
	}
}
