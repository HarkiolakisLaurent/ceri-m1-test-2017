package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {
	
	@Mock
	protected IGameState gameState;
	
	IGameState getTestInstance() {
		return gameState;
	}

}
