package com.cohete.domain;

import java.util.ArrayList;
import java.util.List;

public class Kitprop {
	List <Kitprop> kitprop1 = new ArrayList <Kitprop>();
	List <Kitprop> kitprop2 = new ArrayList <Kitprop>();
	
	public Kitprop( int potencia, int maxpotencia){
		
		this.potencia= potencia;
		this.maxpotencia = maxpotencia;
		
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getMaxpotencia() {
		return maxpotencia;
	}
	public void setMaxpotencia(int maxpotencia) {
		this.maxpotencia = maxpotencia;
	}

	private int potencia;
	private int maxpotencia;
}
