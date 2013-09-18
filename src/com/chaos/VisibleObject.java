package com.chaos;

public abstract class VisibleObject extends PositionedObject {
	public VisibleObject(int x, int y){
		super(x, y);
	}
	
	public VisibleObject(int x, int y, int width, int height) throws Exception {
		super(x,y,width,height);
	}
	
	public abstract void Draw();
}
