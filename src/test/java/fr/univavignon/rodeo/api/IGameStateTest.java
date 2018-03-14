package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IGameStateTest {
	
	@Mock
	IGameStateProvider gameStateProvider;
	
	@Mock
	ISpecie specie;
	
	@Mock
	IAnimal animal;
	
	protected IGameState getTestInstance();

}
