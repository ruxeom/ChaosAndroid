package com.chaos;

import com.chaos.constants.Constants;

import android.util.Log;

public class PositionedObject extends GameObject {
	private int x, y, width, height;
	
	public PositionedObject(){
		super();
	}
	
	public PositionedObject(int x, int y){
		this();
		this.x = x;
		this.y = y;
	}
	
	public PositionedObject(int x, int y, int width, int height) throws Exception {
		this(x, y);
		if(width < 0 || height < 0) {
			Log.d(Constants.DEBUGGER_LABEL, "Incorrect dimensions to PositionedObject: w-> " + width
					+ " h=> " + height);
			throw new Exception("Negative dimensions, really?");
		}
		this.width = width;
		this.height = height;
	}
}
