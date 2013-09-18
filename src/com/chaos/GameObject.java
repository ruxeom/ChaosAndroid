package com.chaos;

import com.chaos.helpers.IDKeeper;

public class GameObject {
	private int ID;
	private String name;
	
	public GameObject(){
		ID = IDKeeper.getNextID();
	}
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;	
	}
}
