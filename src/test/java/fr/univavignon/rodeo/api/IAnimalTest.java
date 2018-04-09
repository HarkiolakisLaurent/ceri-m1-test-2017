package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected IAnimal animal;
	
	protected IAnimal getTestInstance() {
		return animal;
	}
	
	@Test
	public void testGetXP() {
		Mockito.when(getTestInstance().getXP()).thenReturn(1);
		assertEquals(getTestInstance().getXP(),1);
	}
	
	@Test
	public void testIsSecret() {
		Mockito.when(getTestInstance().isSecret()).thenReturn(true);
		assertEquals(getTestInstance().isSecret(),true);
	}
	
	@Test
	public void testIsEndangered() {
		Mockito.when(getTestInstance().isEndangered()).thenReturn(true);
		assertEquals(getTestInstance().isEndangered(),true);
	}
	
	@Test
	public void testIsBoss() {
		Mockito.when(getTestInstance().isBoss()).thenReturn(true);
		assertEquals(getTestInstance().isBoss(),true);
	}
	
}
