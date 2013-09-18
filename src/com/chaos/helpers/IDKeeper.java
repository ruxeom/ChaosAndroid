package com.chaos.helpers;

public class IDKeeper {
	private static int nextID = 1;
	public static int getNextID(){
		return nextID++;
	}
}
