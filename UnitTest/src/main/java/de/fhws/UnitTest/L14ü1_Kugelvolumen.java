package de.fhws.UnitTest;

public class L14ü1_Kugelvolumen {
	public static double berechneKugelvolumen(double radius) {
		if(radius < 0) {
			throw new IllegalArgumentException("Radius darf nicht negativ sein.");
		} else {
		return 4/3 * Math.PI * radius * radius * radius;
		}
	}
	
	 public static void main (String args[]){
		 System.out.println(berechneKugelvolumen(1));
         System.out.println(berechneKugelvolumen(5));
     }
	 
	

}
