package com.cohete.view;

import com.cohete.domain.Cohete;

public class Uso_cohetes {
	
	
		public static void main(String[] args) {
			
		// TODO Auto-generated method stub
			
			Cohete[] cohetes = new Cohete[2];
			cohetes[0] = new Cohete ("x", 3);
			cohetes[1] = new Cohete ("LDSFJA32",6);
			
			for (Cohete e: cohetes) {
				System.out.println("El codigo del cohete es :"+ e.getCode()+ " y tiene "+ e.getPropulsor()+ " propulsores");
			
			}
	}

}
