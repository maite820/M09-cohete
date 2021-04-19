package com.cohete.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cohete.domain.Cohete;
import com.cohete.domain.CoheteView;
import com.cohete.domain.Kitprop;




/**
 * 
 * Seleccionar cohete y propulsor para acelerar o frenar salir del programa si
 * se desea
 * 
 * ver menu
 * 
 *
 */

public class InputManager {


	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner);
		this.view = new CoheteView();
	}

	public void close() {
		this.scanner.close();
	}

	 
		
		
		@SuppressWarnings("deprecation")
		public void showMenu() {
			// iniciar 
			
			List <Kitprop> kitprop1 = new ArrayList <Kitprop>();
			kitprop1.add(new Kitprop(0,10));
			kitprop1.add(new Kitprop(0,30));
			kitprop1.add(new Kitprop(0,80));
			
			Cohete cohete1 = new Cohete ("1",kitprop1);
			cohete1.start();
			cohete1.mostrarcohete();
			
			List <Kitprop> kitprop2 = new ArrayList <Kitprop>();
			kitprop2.add(new Kitprop(0,30));
			kitprop2.add(new Kitprop(0,40));
			kitprop2.add(new Kitprop(0,50));
			kitprop2.add(new Kitprop(0,50));
			kitprop2.add(new Kitprop(0,30));
			kitprop2.add(new Kitprop(0,10));
			
			Cohete cohete2 = new Cohete ("2",kitprop2);
			cohete2.start();
			cohete2.mostrarcohete();
			
		boolean exit = false;
		while (exit == false) {
			view.MainMenu();
			int selectcohete = commons.askOption(1,3);
			if (selectcohete ==3) {
				exit= true;
				try {
					System.out.println ("stop cohete nº1");
					
					cohete1.stop();
					System.out.println ("stop cohete nº2");
					cohete2.stop();
					
					view.endProgram();
				}
				catch (Exception e) {
					System.out.println("Exception");
				}
		break;
	

		}
		view.KitpropulsorMenu();
		int SelectPropulsor = commons.askOption(1, 9);
		
		view.OperationMenu();
		int SelectOperation = commons.askOption(1, 2);
		
		view.ValorMenu();
		int SelectValor = commons.askOption(1, 9);
		
		switch (selectcohete) {
		case 1:
			if(cohete1.getKitprop().size()> SelectPropulsor -1) {
				switch(SelectOperation) {
				case 1:
					cohete1.AccelerarProp(SelectPropulsor-1, SelectValor);
					break;
				case 2:
					cohete1.FrenarProp(SelectPropulsor-1, SelectValor);
					break;
				}
				
			}else {
				System.out.println("no funciona kitpropulsor");
			}
			break;
		case 2:
			if(cohete2.getKitprop().size()>SelectPropulsor-1) {
				switch(SelectOperation) {
				case 1:
					cohete2.AccelerarProp(SelectPropulsor-1, SelectValor);
					break;
				case 2:
					cohete2.FrenarProp(SelectPropulsor-1, SelectValor);
					break;
				}
			}else {
				System.out.println("no funciona kitpropulsor");
			}
		break;
		}
		cohete1.mostrarcohete();
		cohete2.mostrarcohete();
		}
		
		}
		
		
	private Scanner scanner;
	private InputCommons commons;
	private CoheteView view;
	
		}
	
	

			
	