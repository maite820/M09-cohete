package com.cohete.domain;

public class Cohete {

	public Cohete(String code, int numPropulsors) {
		this.code = code;
		this.numPropulsors = numPropulsors;
		potPropulsors = new int[numPropulsors];
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumPropulsors() {
		return numPropulsors;
	}

	public void setNumPropulsors(int numPropulsors) {
		this.numPropulsors = numPropulsors;
	}

	public int[] getPotPropulsors() {
		return potPropulsors;
	}

	public void setPotPropulsors(int[] potPropulsors) {
		this.potPropulsors = potPropulsors;
	}

	String code;
	int numPropulsors = 0;
	int[] potPropulsors = null;

}
