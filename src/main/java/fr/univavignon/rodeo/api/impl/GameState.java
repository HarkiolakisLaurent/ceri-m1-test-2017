package fr.univavignon.rodeo.api.impl;

public class GameState {
	private static GameState instance;
		
	private GameState(){}
		
	public static synchronized GameState getInstance() {
		return instance == null?new GameState():instance;
	}
}
