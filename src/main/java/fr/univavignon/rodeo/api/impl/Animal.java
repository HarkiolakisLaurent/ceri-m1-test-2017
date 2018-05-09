package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal extends NamedObject implements IAnimal {
	
	private int xp; 
	private boolean secret; 
	private boolean endangered; 
	private boolean boss;
	
	public Animal(String name, int xp, boolean secret, boolean endangered, boolean boss) {
		super(name);
		this.xp = xp; 
		this.secret = secret; 
		this.endangered = endangered; 
		this.boss = boss;
	}

	public int getXP() {return this.xp;}

	public boolean isSecret() {return this.secret;}

	public boolean isEndangered() {return this.endangered;}

	public boolean isBoss() {return this.boss;}
}
