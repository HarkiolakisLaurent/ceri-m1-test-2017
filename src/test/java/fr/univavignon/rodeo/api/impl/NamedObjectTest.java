package fr.univavignon.rodeo.api.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.INamedObject;


public class NamedObjectTest {
	
	protected INamedObject namedObject;
	
	@Before
	public void setUp() {
		namedObject = new NamedObject("toto");
	}
	
	@Test
	public void testGetName() {
		assertEquals(namedObject.getName(),"toto");
	}
}
