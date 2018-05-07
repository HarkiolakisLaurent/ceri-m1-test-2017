package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateTest;

public class GameStateTest extends IGameStateTest {
	
	@Override
	public IGameState getTestInstance() {return new GameState("GameState1");}
	
}
