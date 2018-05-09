package fr.univavignon.rodeo.api.impl;

import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.IGameStateProviderTest;

public class GameStateProviderTest extends IGameStateProviderTest {
	
	@Override
	public IGameStateProvider getTestInstance() {return new GameStateProvider();}
	
}
