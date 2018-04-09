package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

public class IEnvironmentProviderTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected IEnvironmentProvider environmentProvider;
	
	@Before
	public void setUp() {
		Mockito.doThrow(new IllegalArgumentException()).when(getTestInstance()).getEnvironment(null);
	}
	
	protected IEnvironmentProvider getTestInstance() {
		return environmentProvider;
		
	}
	
	@Test
	public void testGetAvailableEnvironments() {
		List<String> availableEnvironments = new ArrayList<String>();
		availableEnvironments.add("Environment1");
		availableEnvironments.add("Environment2");
		Mockito.when(getTestInstance().getAvailableEnvironments()).thenReturn(availableEnvironments);
		assertEquals(getTestInstance().getAvailableEnvironments(),availableEnvironments);
	}
	
	@Test
	public void testGetEnvironment() {
		IEnvironment environment = null;
		Mockito.when(getTestInstance().getEnvironment("")).thenReturn(environment);
		assertEquals(getTestInstance().getEnvironment(""),environment);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentIllegalArgumentException() {
		getTestInstance().getEnvironment(null);
	}
	
}
