package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IGameStateProviderTest {
	
	@Mock
	IGameStateProvider gameStateProvider;
	
	protected IGameStateProvider getTestInstance();

}
