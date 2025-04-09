package de.fhws.UnitTest;

public class L15ü3_TextFrage extends L15ü3_Frage {
    public L15ü3_TextFrage(String frage) {
        super(frage);
    }

    @Override
    public void printFrage() {
        String output = frage + "\n\n" + "Antwort:\n" + "\n\n\n\n";
        System.out.println(output);
    }
}
