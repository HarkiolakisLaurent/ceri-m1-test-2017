package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IEnvironmentProviderTest {
	
	@Mock
	IEnvironment environment;
	
	protected IEnvironmentProvider getTestInstance();
	
}
