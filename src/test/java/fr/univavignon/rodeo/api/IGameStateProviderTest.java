package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected IGameStateProvider gameStateProvider;
	
	@Mock
	protected IGameState gameState;
	
	protected IGameStateProvider getTestInstance() {
		return gameStateProvider;
	}
	
	@Test
	public void testGet() {
		Mockito.when(getTestInstance().get("TestGameState")).thenReturn(gameState);
		assertEquals(getTestInstance().get("TestGameState"),gameState);
		
	}

}
