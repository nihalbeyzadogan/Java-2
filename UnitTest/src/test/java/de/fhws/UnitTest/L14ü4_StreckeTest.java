package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L14ü4_StreckeTest {

    @Test
    void richtigSpeichert(){
    	L14ü4_Strecke neu = new L14ü4_Strecke(12,9);
        assertEquals(12,neu.b);
        assertEquals(9,neu.a);
    }
    @Test
    void testÜberschneid() {
    	L14ü4_Strecke erste = new L14ü4_Strecke(5, 8);
    	L14ü4_Strecke zweite = new L14ü4_Strecke(7, 10);
        assertTrue(erste.überschneiden(zweite));
    }
    @Test
    void testToString() {
    	L14ü4_Strecke s1 = new L14ü4_Strecke(3, 5);
    	L14ü4_Strecke s2 = new L14ü4_Strecke(2, 8);
    	L14ü4_Strecke s3 = new L14ü4_Strecke(4, 4);

        assertEquals("3--5", s1.toString());
        assertEquals("2------8", s2.toString());
        assertEquals("4", s3.toString());
    }

}
