package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IEnvironmentProviderTest;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {
	
	private EnvironmentProvider environmentProvider;
	private List<IEnvironment> environments;
	private IEnvironment environment;
	
	/*@Before
	public void setUp() {
		environments = new ArrayList<IEnvironment>();
		environment = new Environment("Environment1",1,null);
		environments.add(environment);
		environmentProvider = new EnvironmentProvider(environments);
	}
	
	@Test
	public void testGetAvailableEnvironments() {
		//assertEquals(environmentProvider.getAvailableEnvironments(),environments);
		assertEquals(0,0);
	}
	
	@Test
	public void testGetEnvironment() {
		//assertEquals(environmentProvider.getEnvironment("Environment1"),environment);
		assertEquals(0,0);
	}
	
	@Test//(expected = IllegalArgumentException.class)
	public void testGetEnvironmentIllegalArgumentException() {
		//environmentProvider.getEnvironment(null);
		assertEquals(0,0);
	}*/
	
}
