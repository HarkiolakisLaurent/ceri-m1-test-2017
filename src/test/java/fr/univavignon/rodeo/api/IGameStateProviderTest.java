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
	
	@Before
	public void setUp() {
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).get(null);
		Mockito.when(getTestInstance().get("TestGameState")).thenReturn(gameState);
	}
	
	protected IGameStateProvider getTestInstance() {
		return gameStateProvider;
	}
	
	@Test
	public void testGet() {
		assertEquals(getTestInstance().get("TestGameState"),gameState);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetIllegalArgumentException() {
		getTestInstance().get(null);
		
	}

}
