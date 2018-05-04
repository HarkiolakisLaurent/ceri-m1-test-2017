package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected IGameState gameState;
	
	@Mock
	protected IEnvironmentProvider environmentProvider;
	
	@Mock
	protected ISpecie specie;
	
	@Mock
	protected IEnvironment environment;
	
	@Mock
	protected IAnimal animal;
	
	protected List<String> availableEnvironments = new ArrayList<String>();
	protected List<ISpecie> species = new ArrayList<ISpecie>();
	protected List<IAnimal> animals = new ArrayList<IAnimal>();
	
	public void setGameState(IGameState gameState) {this.gameState = gameState;}
	
	@Before
	public void setUp() {
		availableEnvironments.add("NextEnvironment");
		Mockito.when(environmentProvider.getAvailableEnvironments()).thenReturn(availableEnvironments);
		Mockito.when(environment.getSpecies()).thenReturn(species);
		animals.add(animal);
		Mockito.when(specie.getAnimals()).thenReturn(animals);
		species.add(specie);
		Mockito.when(environment.getSpecies()).thenReturn(species);
		Mockito.when(getTestInstance().getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);
		Mockito.when(getTestInstance().getProgression()).thenReturn(1);
		Mockito.doThrow(new IllegalStateException()).when(getTestInstance()).exploreArea();
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).catchAnimal(null);
		Mockito.doThrow(new IllegalStateException()).when(getTestInstance()).catchAnimal(animal);
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).getSpecieLevel(null);
	}
	
	protected IGameState getTestInstance() {
		return gameState;
	}
	
	@Test
	public void testExploreArea() {
		assertEquals(environmentProvider.getAvailableEnvironments(),availableEnvironments);
		assertEquals(environment.getSpecies(),species);
		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExploreAreaIllegalStateException() {
		getTestInstance().exploreArea();
		
	}
	
	@Test
	public void testCatchAnimal() {
		assertEquals(environment.getSpecies().contains(specie),true);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalIllegalArgumentException() {
		getTestInstance().catchAnimal(null);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalIllegalStateException() {
		getTestInstance().catchAnimal(animal);
	}
	
	@Test
	public void testGetSpecieLevel() {
		assertEquals(getTestInstance().getSpecieLevel(specie),SpecieLevel.NOVICE);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevelIllegalArgumentException() {
		getTestInstance().getSpecieLevel(null);
	}
	
	@Test
	public void testGetProgression() {
		assertEquals(getTestInstance().getProgression(),1);
	}

}
