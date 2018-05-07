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
	
	protected static List<String> availableEnvironments = new ArrayList<String>();
	
	public static IEnvironmentProvider setUp() {
		environmentProvider = mock(IEnvironmentProvider.class);
        when(environmentProvider.getEnvironment("Environment1")).thenReturn(environment);
		doThrow(new IllegalArgumentException()).when(environmentProvider).getEnvironment(null);
		availableEnvironments.add("Environment1");
        when(environmentProvider.getAvailableEnvironments()).thenReturn(availableEnvironments);
		return environmentProvider;
	}
	
	public IEnvironmentProvider getTestInstance() {return setUp();}
	
	@Test
	public void testGetAvailableEnvironments() {assertEquals(getTestInstance().getAvailableEnvironments(),availableEnvironments);}
	
	@Test
	public void testGetEnvironment() {assertEquals(getTestInstance().getEnvironment(""),null);}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentIllegalArgumentException() {getTestInstance().getEnvironment(null);}
	
}
