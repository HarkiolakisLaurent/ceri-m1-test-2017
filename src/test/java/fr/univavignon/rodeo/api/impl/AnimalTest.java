package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;

public class AnimalTest extends IAnimalTest {
	
	private IAnimal animal;
	
	@Before
	public void setUp() {
		animal = new Animal("toto",10,false,false,false);
	}
	
	/*@Test
	public void testGetXP(){
		assertEquals(animal.getXP(),10);
	}
	
	@Test
	public void testIsSecret(){
		assertEquals(animal.isSecret(),false);
	}
	
	@Test
	public void testIsEndangered(){
		assertEquals(animal.isEndangered(),false);
	}
	
	@Test
	public void testIsBoss(){
		assertEquals(animal.isBoss(),false);
	}*/
}
