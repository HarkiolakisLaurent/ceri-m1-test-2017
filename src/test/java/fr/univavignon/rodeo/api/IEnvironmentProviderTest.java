package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IEnvironmentProviderTest {
	
	@Mock
	IEnvironmentProvider environmentProvider;
	
	protected IEnvironmentProvider getTestInstance();
	
}
