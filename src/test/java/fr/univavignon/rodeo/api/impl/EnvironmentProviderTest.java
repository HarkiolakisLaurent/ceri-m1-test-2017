package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IEnvironmentProviderTest;
import fr.univavignon.rodeo.api.IEnvironmentTest;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {
	
	@Override
	public IEnvironmentProvider getTestInstance() {
		List<IEnvironment> environments = new ArrayList<IEnvironment>();
		IEnvironment environment = IEnvironmentTest.setUp();
		environments.add(environment);
		return new EnvironmentProvider(environments);
	}
	
}
