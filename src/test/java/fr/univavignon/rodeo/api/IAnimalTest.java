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
	
	@Before
	public void setUp() {
		Mockito.when(getTestInstance().getXP()).thenReturn(1);
		Mockito.when(getTestInstance().isSecret()).thenReturn(true);
		Mockito.when(getTestInstance().isEndangered()).thenReturn(true);
		Mockito.when(getTestInstance().isBoss()).thenReturn(true);
	}
	
	protected IAnimal getTestInstance() {
		return animal;
	}
	
	@Test
	public void testGetXP() {
		assertEquals(getTestInstance().getXP(),1);
	}
	
	@Test
	public void testIsSecret() {
		assertEquals(getTestInstance().isSecret(),true);
	}
	
	@Test
	public void testIsEndangered() {
		assertEquals(getTestInstance().isEndangered(),true);
	}
	
	@Test
	public void testIsBoss() {
		assertEquals(getTestInstance().isBoss(),true);
	}
	
}
