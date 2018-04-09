package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected ISpecie specie;
	
	ISpecie getTestInstance() {
		return specie;
	}
	
	@Test
	public void testGetArea() {
		Mockito.when(getTestInstance().getArea()).thenReturn(1);
		assertEquals(getTestInstance().getArea(),1);
	}
	
	@Test
	public void testGetAnimals() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		IAnimal animal = null;
		for (int i = 0;i<3;i++)
			animals.add(animal);
		Mockito.when(getTestInstance().getAnimals()).thenReturn(animals);
		assertEquals(getTestInstance().getAnimals(),animals);
	}
	
}
