package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	
	@Mock
	protected IGameStateProvider gameStateProvider;
	
	protected IGameStateProvider getTestInstance() {
		return gameStateProvider;
	}
	
	@Test
	public void testCreateGameState() {
		
	}

}
