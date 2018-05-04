package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironmentProviderTest;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {
	
	@Before
	public void setUp() {
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).getEnvironment(null);
		availableEnvironments.add("Environment1");
		availableEnvironments.add("Environment2");
		Mockito.when(getTestInstance().getAvailableEnvironments()).thenReturn(availableEnvironments);
		Mockito.when(getTestInstance().getEnvironment("")).thenReturn(null);
	}

}
