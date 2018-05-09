package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doThrow;
import org.mockito.junit.*;

public class IEnvironmentProviderTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected static IEnvironmentProvider environmentProvider;
	
	@Mock
	protected static IEnvironment environment = IEnvironmentTest.setUp();
	
	public static IEnvironmentProvider setUp() {
		environmentProvider = mock(IEnvironmentProvider.class);
        when(environmentProvider.getEnvironment("Environment1")).thenReturn(environment);
		doThrow(new IllegalArgumentException()).when(environmentProvider).getEnvironment(null);
		List<String> environments = new ArrayList<String>();
		environments.add("Environment1");
        when(environmentProvider.getAvailableEnvironments()).thenReturn(environments);
		return environmentProvider;
	}
	
	public IEnvironmentProvider getTestInstance() {return setUp();}
	
	@Test
	public void testGetAvailableEnvironments() {
		List<String> environments = new ArrayList<String>();
		environments.add("Environment1");
		assertEquals(getTestInstance().getAvailableEnvironments(),environments);
	}
	
	@Test
	public void testGetEnvironment() {
		assertEquals(getTestInstance().getEnvironment("Environment1").getName(),environment.getName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentIllegalArgumentException() {getTestInstance().getEnvironment(null);}
	
}
