package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IAnimalTest {

	@Mock
	IAnimal animal;
	
	protected IAnimal getTestInstance();
	
	animal = new Animal("10",false,false,false);
	
}
