package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected IGameState gameState;
	
	IGameState getTestInstance() {
		return gameState;
	}
	
	@Test
	public void testGetSpecieLevel() {
		ISpecie specie = null;
		Mockito.when(getTestInstance().getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);
		assertEquals(getTestInstance().getSpecieLevel(specie),SpecieLevel.NOVICE);
	}
	
	@Test
	public void testGetProgression() {
		Mockito.when(getTestInstance().getProgression()).thenReturn(1);
		assertEquals(getTestInstance().getProgression(),1);
	}

}
