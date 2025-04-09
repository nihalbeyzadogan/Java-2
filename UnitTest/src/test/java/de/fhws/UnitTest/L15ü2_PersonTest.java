package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L15ü2_PersonTest {
    @Test
    public void testPersonArray() {
    	L15ü2_Person[] personen = new L15ü2_Person[100];
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                personen[i] = new L15ü2_Student("Programmieren");
            } else {
                personen[i] = new L15ü2_Professor("Programmieren");
            }
        }

        for (int i = 0; i < personen.length; i++) {
            for (int j = 0; j < 1; j++) {  
                personen[i].gibTaetigkeitAus();
            }
        }
        assertTrue(personen[0] instanceof L15ü2_Student);
        assertTrue(personen[1] instanceof L15ü2_Professor);
    }
}
