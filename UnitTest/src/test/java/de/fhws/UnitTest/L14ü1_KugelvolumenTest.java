package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L14ü1_KugelvolumenTest {

//	@Test
//	public void test1() {
//		double x = 2.5;
//		double y = 2.5;
//		assertEquals(x,y);  //run 1 für a)
//	}
//	
	@Test 
	public void berechneTestNull() {
		double result = L14ü1_Kugelvolumen.berechneKugelvolumen(0);
		assertEquals(0,result);
	}
	
	
	@Test 
	public void berechneTestEins() {
		double result = L14ü1_Kugelvolumen.berechneKugelvolumen(1);
		assertEquals(3.141592653589793,result);  
	}
	
	@Test 
	public void berechneTestFünf() {
		double result = L14ü1_Kugelvolumen.berechneKugelvolumen(5);
		assertEquals(392.69908169872417,result);
	}
	
	@Test 
	public void berechneTestMinusEins() {
		
		assertThrows(IllegalArgumentException.class,() -> { L14ü1_Kugelvolumen.berechneKugelvolumen(-1); } );
	}
} 
