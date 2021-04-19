package com.cohete.domain;


public class CoheteView {

	
	public void MainMenu() {
		
	System.out.println("selecciona un cohete");
	System.out.println("1- cohete nº 1");
	System.out.println("2- cohete nº 2");
	System.out.println("3- Salir" );
	
	}
	
	public void KitpropulsorMenu() {
		System.out.println ("seleciona el numero de Kitpropulsor, gracias");
		
	}
	
	public void OperationMenu() {
		System.out.println("selecciona operacion a ejecutar");
		System.out.println("1- accelerar propulsor");
		System.out.println("2- frenar propulsor");
		
	}
	
	public void ValorMenu() {
		System.out.println ("seleciona el valor de la operacion, entre 1 y 9");
	
	}

	
	
	public void endProgram() {
		System.out.println("Fin programa");  
	}
}

