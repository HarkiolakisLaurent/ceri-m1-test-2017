package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

public interface IEnvironmentTest {

	@Mock
	IEnvironmentProvider environmentProvider;
	
	@Mock
	ISpecie specie;
	
	protected IEnvironment getTestInstance();
	
}
