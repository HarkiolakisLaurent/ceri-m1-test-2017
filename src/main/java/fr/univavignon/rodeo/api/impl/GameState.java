package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameState extends NamedObject implements IGameState {
	
	private int progression;
	
	public GameState(String name) {
		super(name);
		this.progression = 10;
	}

	public void exploreArea() throws IllegalStateException {
		// si la zone n'est pas explorable
		throw new IllegalStateException();
	}

	public void catchAnimal(IAnimal animal) throws IllegalArgumentException,
			IllegalStateException {
		if(animal == null)
			throw new IllegalArgumentException(); 
		else {
			//si l'animal est introuvable
			throw new IllegalStateException();
		}
	}

	public SpecieLevel getSpecieLevel(ISpecie specie)
			throws IllegalArgumentException {
		if(specie == null)
			throw new IllegalArgumentException();
		else {		
			int xp = 0;  
			for(IAnimal animal : specie.getAnimals())
				xp += animal.getXP();
			if(xp < 25)
				return SpecieLevel.NOVICE;
			else {
				if(xp >= 25 && xp < 150)
					return SpecieLevel.WRANGLER;
				else {
					if(xp >= 150 && xp < 600)
						return SpecieLevel.CHAMPION;
					else
						return SpecieLevel.MASTER;
				}
			}
		}
	}

	public int getProgression() {
		return 10;
	}
}
