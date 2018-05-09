package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.impl.Animal;
import fr.univavignon.rodeo.api.impl.Specie;

public class IEnvironmentTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected static IEnvironment environment;
	
	protected List<ISpecie> species = new ArrayList<ISpecie>();
	
	public static IEnvironment setUp() {
		environment = mock(IEnvironment.class);
        when(environment.getName()).thenReturn("Environment1");
        when(environment.getAreas()).thenReturn(1);
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(new Animal("Animal1",10,false,false,false));				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(new Specie("Specie1",10,animals));
        when(environment.getSpecies()).thenReturn(species);
		return environment;
	}
	
	protected IEnvironment getTestInstance() {return setUp();}
	
	@Test
	public void testGetAreas() {assertEquals(getTestInstance().getAreas(),1);}
	
	@Test
	public void testGetSpecies() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.setUp());				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(ISpecieTest.setUp());
		assertEquals(species.size(), getTestInstance().getSpecies().size());
		assertEquals("Specie1", getTestInstance().getSpecies().get(0).getName());
	}
	
}
