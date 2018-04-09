package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	@Mock
	protected ISpecie specie;
	
	ISpecie getTestInstance() {
		return specie;
	}
	
}
