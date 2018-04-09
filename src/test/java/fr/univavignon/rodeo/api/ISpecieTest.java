package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface ISpecieTest {

	@Mock
	ISpecie specie;
	
	protected ISpecie getTestInstance();
	
}
