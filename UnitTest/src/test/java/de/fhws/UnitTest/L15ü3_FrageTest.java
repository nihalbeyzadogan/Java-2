package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L15ü3_FrageTest {
    @Test
    public void testTextfrage() {
    	L15ü3_Frage frage = new L15ü3_TextFrage("Was ist die Hauptstadt von Deutschland?");

        frage.printFrage();
    }

    @Test
    public void testMultipleChoice() {
    	L15ü3_Frage frage = new L15ü3_MultipleChoiceFrage("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"0", "1", "2", "3"});

        frage.printFrage();
    }

}
