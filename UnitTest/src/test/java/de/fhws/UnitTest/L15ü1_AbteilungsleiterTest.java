package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L15ü1_AbteilungsleiterTest {

	@Test
	void testBefoerdern() {
	    L15ü1_Angestellter angestellter = new L15ü1_Angestellter("Schmidt", 2, "Anna", 3000, "01.01.1990");
	    L15ü1_Abteilungsleiter leiter = new L15ü1_Abteilungsleiter("Müller", 1, "Hans", 4000, "01.01.1980");
	    
	    leiter.befoerdern(angestellter);
	    assertEquals(2, leiter.getGehaltsfaktor());
	    assertEquals(1.1, angestellter.getGehaltsfaktor());
	    leiter.befoerdern(angestellter);
	    assertEquals(1.21 ,angestellter.getGehaltsfaktor(), 0.001);//*
	    
	}
	

}
