package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameStateTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameStateTest extends IGameStateTest {

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

}
