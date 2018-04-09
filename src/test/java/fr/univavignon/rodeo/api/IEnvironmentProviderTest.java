package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import fr.univavignon.rodeo.api.IEnvironmentProvider;

public interface IEnvironmentProviderTest {
	
	@Mock
	protected IEnvironmentProvider environmentProvider;
	
	IEnvironmentProvider getTestInstance();
	
	@Test
	public void testCreateEnvironment();
	
}
