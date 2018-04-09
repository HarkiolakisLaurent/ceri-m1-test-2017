package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import fr.univavignon.rodeo.api.IGameStateProvider;

public interface IGameStateProviderTest {
	
	@Mock
	protected IGameStateProvider gameStateProvider;
	
	IGameStateProvider getTestInstance();
	
	@Test
	public void testCreateGameState();

}
