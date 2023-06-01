package com.it.Writer;

public class Writer {

	Pen pen;

	/*
	 * public Writer(Pen pen) { this.pen = pen; }
	 */
	public void write() {
		pen.ink();

	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
