package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import fr.univavignon.rodeo.api.IGameState;

public interface IGameStateTest {
	
	@Mock
	protected IGameState gameState;
	
	IGameState getTestInstance();

}
