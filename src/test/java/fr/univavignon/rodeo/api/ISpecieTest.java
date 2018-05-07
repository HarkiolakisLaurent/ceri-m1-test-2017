package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected static ISpecie specie;
	
	protected List<IAnimal> animals = new ArrayList<IAnimal>();
	protected IAnimal animal = null;
	
	public static ISpecie setUp() {
		ISpecie specie = mock(ISpecie.class);
		when(specie.getArea()).thenReturn(10);
		when(specie.getName()).thenReturn("Specie1");
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.setUp());
	    when(specie.getAnimals()).thenReturn(animals);
	    return specie;
	}
	
	protected ISpecie getTestInstance() {
		return setUp();
	}
	
	@Test
	public void testGetArea() {
		assertEquals(getTestInstance().getArea(),10);
	}
	
	@Test
	public void testGetAnimals() {
		ISpecie specie = getTestInstance();
		List<IAnimal> animals = new ArrayList<IAnimal>();
		IAnimal animal = IAnimalTest.setUp();
		animals.add(animal);
		assertEquals(animals.size(), specie.getAnimals().size());
		assertEquals(animal.getName(),specie.getAnimals().get(0).getName());
	}
	
}
