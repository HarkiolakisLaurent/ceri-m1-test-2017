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
	
	protected List<IAnimal> animals = new ArrayList<IAnimal>();
	protected IAnimal animal = null;
	
	protected ISpecie getTestInstance() {
		return specie;
	}

	/*@Before
	public void setUp() {
		Mockito.when(getTestInstance().getArea()).thenReturn(1);
		for (int i = 0;i<3;i++)
			animals.add(animal);
		Mockito.when(getTestInstance().getAnimals()).thenReturn(animals);
	}*/
	
	@Test
	public void testGetArea() {
		assertEquals(getTestInstance().getArea(),1);
	}
	
	@Test
	public void testGetAnimals() {
		assertEquals(getTestInstance().getAnimals(),animals);
	}
	
}
