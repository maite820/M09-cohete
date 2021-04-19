package com.cohete.view;

import com.cohete.domain.*;

public class Uso_cohetes {
	
	
		

		public static void main(String[] args) {
			//FASE 2:
			
							
			// cohetes con sus codigos y numero de propulsores 
			
			Cohete cohete1 = new Cohete("32WESSDS",3);
			Cohete cohete2 = new Cohete("LDSFJA32",6);
			
			
			//potencia propulsores
		
			int[] prop1= {10,30,80};
			cohete1.setPotPropulsors(prop1);
			
			
			
			int[] prop2= {30,40,50,50,30,10};
			cohete2.setPotPropulsors(prop2);
			
			//Mostrar  codigos  cohetes y propulsores.potencia maxima
			
			
			System.out.print(cohete1.getCode() + ": ");
			for (int i=0; i<cohete1.getPotPropulsors().length; i++){
				System.out.print(cohete1.getPotPropulsors()[i]);
				if (i!=cohete1.getPotPropulsors().length-1) {
					System.out.print(",");
				}
			}
			System.out.println();
			
			System.out.print(cohete2.getCode() + ": ");
			for (int i=0; i<cohete2.getPotPropulsors().length; i++){
				System.out.print(cohete2.getPotPropulsors()[i]);
				if (i!=cohete2.getPotPropulsors().length-1) {
					System.out.print(",");
				}
			}
		}
	
			
			
				
			
					
		
			
		}
		
			
	


