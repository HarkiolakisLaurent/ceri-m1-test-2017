package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import fr.univavignon.rodeo.api.IEnvironment;

public interface IEnvironmentTest {

	@Mock
	protected IEnvironment environment;
	
	IEnvironment getTestInstance();
	
}
