package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L14ü3_PersonTest {

    @Test
    void PersonTest(){
    		L14ü3_Adresse adresse = new L14ü3_Adresse("Grombühlstrasse", "Wü", "97074", "12"); //R:new L14ü3_Adresse("Grombühlstrasse", "12", "97074", "Würzburg");
    		L14ü3_Person person = new L14ü3_Person("Beyza", "Dogan", adresse);
            assertEquals("Beyza", person.getVorname());
            assertEquals("Grombühlstrasse", person.getAdresse().getStrasse());
        } //soll error geben
    
        @Test
        void testVornameMitKleinbuchstaben() {
        	L14ü3_Adresse adresse = new L14ü3_Adresse("Grombühlstrasse", "1", "97074", "Würzburg");
            assertThrows(RuntimeException.class, () -> {
                new L14ü3_Person("beyza", "Dogan", adresse);
            });
        }
        @Test
         void testStrasseMitKleinbuchstaben() {
        	L14ü3_Adresse adresse = new L14ü3_Adresse("grombühlstrasse", "1", "97074", "Würzburg");
             assertThrows(RuntimeException.class, () -> {
             new L14ü3_Person("Beyza", "Dogan", adresse);
        });
    }
        @Test
        void testHausnummerMitBuchstabeVorNo() {
            L14ü3_Adresse adresse = new L14ü3_Adresse("Grombühlstrasse", "a1", "97074", "Würzburg");
            assertThrows(RuntimeException.class, () -> {
                new L14ü3_Person("Beyza", "Dogan", adresse);
            });
        }

        @Test
        void testOrtMitKleinbuchstaben() {
            L14ü3_Adresse adresse = new L14ü3_Adresse("Grombühlstrasse", "1", "97074", "würzburg");
            assertThrows(RuntimeException.class, () -> {
                new L14ü3_Person("Beyza", "Dogan", adresse);
            });
        }

}
