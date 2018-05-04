package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IGameState;

public class GameStateProvider {
		
	private List<IGameState> gameStates;
	private static GameStateProvider instance;
		
	public GameStateProvider() {
		gameStates = new ArrayList<IGameState>();
	}
	
	public void save(IGameState gameState) {
		if(gameState != null)
			this.gameStates.add(gameState);
	}
	
	public IGameState get(String name) throws IllegalArgumentException {
		if(name == null)
			throw new IllegalArgumentException() ;
		else {
			for(IGameState gameState : gameStates) {
				if(gameState.getName().equals(name))
					return gameState;
			}
		}
		return new GameState("toto",0);
	
	}
		
	public static synchronized GameStateProvider getInstance() {
		return instance == null?null:instance;
	}
}
