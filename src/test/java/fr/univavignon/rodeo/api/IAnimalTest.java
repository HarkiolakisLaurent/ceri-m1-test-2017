package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IAnimalTest {

	@Mock
	ISPecie specie;
	
	@Mock
	IGameState gameState;
	
	protected IAnimal getTestInstance();
	
}
