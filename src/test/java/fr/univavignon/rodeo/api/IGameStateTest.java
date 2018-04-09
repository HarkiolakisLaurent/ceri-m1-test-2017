package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IGameStateTest {
	
	@Mock
	IGameState gameState;
	
	protected IGameState getTestInstance();

}
