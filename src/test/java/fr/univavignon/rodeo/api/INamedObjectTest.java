package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class INamedObjectTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Mock
	protected INamedObject namedObject;
	
	@Before
	public void setUp() {
		Mockito.when(namedObject.getName()).thenReturn("toto");
	}
	
	protected INamedObject getTestInstance() {
		return namedObject;
	}
	
	@Test
	public void testGetName(){
		assertEquals(namedObject.getName(),"toto");
	}

}
