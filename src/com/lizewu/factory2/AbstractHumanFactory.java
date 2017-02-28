package com.lizewu.factory2;


public abstract class AbstractHumanFactory {
	
	public abstract <T extends Human> T createHuman(Class<T> c);
}
