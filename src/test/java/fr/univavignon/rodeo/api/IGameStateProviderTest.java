package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doThrow;

import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected static IGameStateProvider gameStateProvider;
	
	@Mock
	protected static IGameState gameState;
	
	@Mock
	protected static IGameState gameState2 = IGameStateTest.setUp();
	
	public static IGameStateProvider setUp() {
		gameStateProvider = mock(IGameStateProvider.class);
		doThrow(new IllegalArgumentException()).when(gameStateProvider).get(null);
		
        when(gameStateProvider.get("GameState1")).thenReturn(gameState);
        when(gameStateProvider.get("GameState1").getName()).thenReturn("GameState1");
        
		gameStateProvider.save(gameState2);
        when(gameStateProvider.get("GameState2")).thenReturn(gameState2);
        when(gameStateProvider.get("GameState2").getName()).thenReturn("GameState2");
        
		return gameStateProvider;
	}
	
	protected IGameStateProvider getTestInstance() {
		return setUp();
	}
	
	@Test
	public void testGet() {
		assertEquals(getTestInstance().get("GameState1"),gameState);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetIllegalArgumentException() {
		getTestInstance().get(null);
		
	}

}
