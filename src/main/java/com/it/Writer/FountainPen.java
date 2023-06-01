package com.it.Writer;

import com.it.Ink.Ink;

public class FountainPen implements Pen {

	Ink ink;

	/*
	 * public FountainPen(Ink ink) {
	 * 
	 * this.ink = ink;
	 * 
	 * }
	 */
	
	public void setInk(Ink ink) {
		this.ink = ink;
	}


	public Ink getInk() {
		return ink;
	}


	public void ink() {
		System.out.println("enter into fountainPen");
		ink.write();;

	}

}
