package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IEnvironment;

public class IEnvironmentTest {

	@Mock
	protected IEnvironment environment;
	
	protected IEnvironment getTestInstance() {
		return environment;
	}
	
}
