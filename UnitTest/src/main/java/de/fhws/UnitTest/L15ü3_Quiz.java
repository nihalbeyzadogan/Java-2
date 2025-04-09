package de.fhws.UnitTest;

public class L15ü3_Quiz {
	L15ü3_Frage[] fragen;
    public void printQuizBogen() {
        for (int i = 0; i < fragen.length; i++) {
            fragen[i].printFrage();
        }
    }
}
