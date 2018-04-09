package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IEnvironmentTest {

	@Mock
	IEnvironment environment;
	
	protected IEnvironment getTestInstance();
	
}
