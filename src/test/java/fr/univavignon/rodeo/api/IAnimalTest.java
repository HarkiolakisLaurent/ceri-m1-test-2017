package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected IAnimal animal;
	
	public static IAnimal setUp() {
		IAnimal animal = mock(IAnimal.class);	
		when(animal.getXP()).thenReturn(10);
        when(animal.isSecret()).thenReturn(false);
        when(animal.isEndangered()).thenReturn(false);
        when(animal.isBoss()).thenReturn(false);
		return animal;
	}
	
	protected IAnimal getTestInstance() {
		return setUp();
	}
	
	@Test
	public void testGetXP() {
		assertEquals(getTestInstance().getXP(),10);
	}
	
	@Test
	public void testIsSecret() {
		assertEquals(getTestInstance().isSecret(),false);
	}
	
	@Test
	public void testIsEndangered() {
		assertEquals(getTestInstance().isEndangered(),false);
	}
	
	@Test
	public void testIsBoss() {
		assertEquals(getTestInstance().isBoss(),false);
	}
	
}
