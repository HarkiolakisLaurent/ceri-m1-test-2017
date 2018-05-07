package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.INamedObject;
import fr.univavignon.rodeo.api.INamedObjectTest;


public class NamedObjectTest extends INamedObjectTest {
	
	@Override
	public INamedObject getTestInstance() {return new NamedObject("toto");}
	
}
