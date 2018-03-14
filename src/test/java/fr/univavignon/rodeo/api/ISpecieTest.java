package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface ISpecieTest {

	@Mock
	IEnvironment environment;
	
	@Mock
	IGameState gameState;
	
	@Mock
	IAnimal animal;
	
	protected ISpecie getTestInstance();
	
}
