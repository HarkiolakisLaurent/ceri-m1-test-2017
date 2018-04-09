package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.when;
import org.mockito.junit.*;


import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {

	@Mock
	protected IAnimal animal;
	
	//private static mock = new Animal("10",false,false,false);
	
	protected IAnimal getTestInstance() {
		return animal;
	}
	
	void configureIAnimal(IAnimal mock) {
		
	}
	
	
	
}
