package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import fr.univavignon.rodeo.api.IEnvironment;

public class IEnvironmentTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	protected IEnvironment environment;
	
	protected IEnvironment getTestInstance() {
		return environment;
	}
	
	@Test
	public void testGetAreas() {
		Mockito.when(getTestInstance().getAreas()).thenReturn(5);
		assertEquals(getTestInstance().getAreas(),5);
	}
	
	@Test
	public void testGetSpecies() {
		List<ISpecie> species = new ArrayList<ISpecie>();
		ISpecie specie = null;
		for (int i = 0;i<3;i++)
			species.add(specie);
		Mockito.when(getTestInstance().getSpecies()).thenReturn(species);
		assertEquals(getTestInstance().getSpecies(),species);
	}
	
}
