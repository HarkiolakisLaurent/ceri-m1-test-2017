package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doThrow;

import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected static IGameState gameState;
	
	@Mock
	protected static IEnvironmentProvider environmentProvider;
	
	protected static ISpecie noviceSpecie = ISpecieTest.setUp();
	
	@Mock
	protected static IEnvironment environment;
	
	@Mock
	protected static IAnimal animal;
	
	protected List<String> availableEnvironments = new ArrayList<String>();
	protected static List<ISpecie> species = new ArrayList<ISpecie>();
	
	public static IGameState setUp() {
		gameState = mock(IGameState.class);
		doThrow(new IllegalStateException()).when(gameState).exploreArea();
		doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(null);
		doThrow(new IllegalArgumentException()).when(gameState).getSpecieLevel(null);
		doThrow(new IllegalStateException()).when(gameState).catchAnimal(animal);
        when(gameState.getSpecieLevel(noviceSpecie)).thenReturn(SpecieLevel.NOVICE);
        when(gameState.getProgression()).thenReturn(10);
		return gameState;
	}
	
	protected IGameState getTestInstance() {return setUp();}
	
	@Test
	public void testExploreArea() {
		assertEquals(environmentProvider.getAvailableEnvironments(),availableEnvironments);
		assertEquals(environment.getSpecies(),species);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExploreAreaIllegalStateException() {getTestInstance().exploreArea();}
	
	@Test
	public void testCatchAnimal() {assertEquals(environment.getSpecies().contains(noviceSpecie),false);}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalIllegalArgumentException() {getTestInstance().catchAnimal(null);}
	
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalIllegalStateException() {getTestInstance().catchAnimal(animal);}
	
	@Test
	public void testGetSpecieLevel() {assertEquals(getTestInstance().getSpecieLevel(noviceSpecie),SpecieLevel.NOVICE);}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevelIllegalArgumentException() {getTestInstance().getSpecieLevel(null);}
	
	@Test
	public void testGetProgression() {assertEquals(getTestInstance().getProgression(),10);}

}
