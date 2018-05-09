package fr.univavignon.rodeo.api.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private List<IEnvironment> environments;
	
	public EnvironmentProvider(List<IEnvironment> environments) {this.environments = environments;}
	
	public List<String> getAvailableEnvironments() {
		List<String> environments = new ArrayList<String>();
		for(IEnvironment environment : this.environments) {
			environments.add(environment.getName());
		}
		return environments;
	}

	public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
		if(name == null)
			throw new IllegalArgumentException();
		else {
			for(IEnvironment environment : this.environments) {
				if(environment.getName().equals(name))
					return environment;
			}
		}
		return null;
	}
}
