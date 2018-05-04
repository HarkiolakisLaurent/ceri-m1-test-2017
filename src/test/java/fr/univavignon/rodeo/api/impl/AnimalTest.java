package fr.univavignon.rodeo.api.impl;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimalTest;

public class AnimalTest extends IAnimalTest{@Before
	public void setUp() {
	Mockito.when(getTestInstance().getXP()).thenReturn(1);
	Mockito.when(getTestInstance().isSecret()).thenReturn(true);
	Mockito.when(getTestInstance().isEndangered()).thenReturn(true);
	Mockito.when(getTestInstance().isBoss()).thenReturn(true);
}

}
