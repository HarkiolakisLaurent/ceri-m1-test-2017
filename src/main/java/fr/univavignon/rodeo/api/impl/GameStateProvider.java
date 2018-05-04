package fr.univavignon.rodeo.api.impl;

public class GameStateProvider {
	private static GameStateProvider instance;
		
	private GameStateProvider(){}
		
	public static synchronized GameStateProvider getInstance() {
		return instance == null?new GameStateProvider():instance;
	}
}
