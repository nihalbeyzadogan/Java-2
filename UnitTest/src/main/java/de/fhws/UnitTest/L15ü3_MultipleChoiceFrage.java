package de.fhws.UnitTest;

public class L15ü3_MultipleChoiceFrage extends L15ü3_Frage{
	String[] antworten;

    public L15ü3_MultipleChoiceFrage(String frage, String[] antworten) {
        super(frage);
        this.antworten = antworten;
    }

    @Override
    public void printFrage() {
        String output = "Fragentext:\n" + frage + "\n\nAntwortmöglichkeiten:\n";
        for (int i = 0; i < antworten.length; i++) {
            output += Character.toString('A' + i) + ": " + antworten[i] + "\n";
        }

        System.out.println(output);
    }
}
