package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

public class IEnvironmentProviderTest {
	
	@Mock
	protected IEnvironmentProvider environmentProvider;
	
	protected IEnvironmentProvider getTestInstance() {
		return environmentProvider;
		
	}
	
	@Test
	public void testCreateEnvironment() {
		
	}
	
}
