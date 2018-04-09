package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import fr.univavignon.rodeo.api.ISpecie;

public interface ISpecieTest {

	@Mock
	protected ISpecie specie;
	
	ISpecie getTestInstance();
	
}
