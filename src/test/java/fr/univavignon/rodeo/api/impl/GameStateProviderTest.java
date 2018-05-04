package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameStateProviderTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameStateProviderTest extends IGameStateProviderTest {
	
	@Before
	public void setUp() {
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).get(null);
		Mockito.when(getTestInstance().get("TestGameState")).thenReturn(gameState);
	}

}
