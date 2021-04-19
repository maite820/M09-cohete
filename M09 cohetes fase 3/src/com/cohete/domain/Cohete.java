package com.cohete.domain;

import java.util.List;

public class Cohete extends Thread{

	
	
	public Cohete( String code, List<Kitprop> kitprop) {
		this.code = code;
		this.kitprop =kitprop;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Kitprop> getKitprop() {
		return kitprop;
	}

	public void setKitprop(List<Kitprop> kitprop) {
		this.kitprop = kitprop;
	
	}
	
	
	
	
	@Override
	public void run() {
		// interfaz runnable
	
		System.out.println("el programa se esta ejecutando");
		try {
			//codigo de la tarea dentro del metodo run
			
			while(salir == false) {
			}
		}catch (Exception e) {
			System.out.println("Exception ");
		}
	}
	
	
			
	public void FrenarProp(int propulsor, int VOperation) {
		try {
			
			int valor =
					kitprop.get(propulsor).getPotencia() - VOperation;
			if (valor >=0 ) {
				kitprop.set(propulsor, new Kitprop ((kitprop.get(propulsor).getPotencia()-VOperation),
						kitprop.get(propulsor).getMaxpotencia()));
				System.out.println("holding back");
			}else {
				System.out.println("No se puede reducir la potencia"+(kitprop.get(propulsor).getPotencia()-VOperation));
				}
		} catch (Exception e) {
			System.out.println("Excepcion");
		}
	}

	public void AccelerarProp(int propulsor, int VOperation) {
		try {
			
			int valor =
					kitprop.get(propulsor).getPotencia() + VOperation;
			if (kitprop.get(propulsor).getMaxpotencia()>=valor ) {
				kitprop.set(propulsor, new Kitprop ((kitprop.get(propulsor).getPotencia()+VOperation),
						kitprop.get(propulsor).getMaxpotencia()));
				System.out.println("El propulsor esta acelerando");
			}else {
				System.out.println("Excedida la potencia maxima"+(kitprop.get(propulsor).getPotencia()-VOperation));
				}
		} catch (Exception e) {
			System.out.println("Excepcion");
		}
		
	}
	
	public void mostrarcohete() {
		// TODO Auto-generated method stub
		try {
			System.out.flush();
		System.out.println("cohete"+code);
		System.out.println("kitpropulsor numero" +kitprop.size());
		
		for (int i=0; i < kitprop.size(); i++) {
			System.out.println("kitpropulsor"+ (i+1) + " "+
		"potencia: "+ kitprop.get(i).getPotencia()
		+ "maxima potencia: "+kitprop.get(i).getMaxpotencia());
		}
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

	String code;
	List <Kitprop> kitprop;
	boolean salir =false;
	Thread cohete1;
	Thread cohete2;
	
	
	
	
	}

