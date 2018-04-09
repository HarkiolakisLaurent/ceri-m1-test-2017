package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.when;


import fr.univavignon.rodeo.api.IAnimal;

public interface IAnimalTest {

	@Mock
	protected IAnimal animal;
	
	//private static mock = new Animal("10",false,false,false);
	
	IAnimal getTestInstance();
	
	void configureIAnimal(IAnimal mock);
	
	
	
}
