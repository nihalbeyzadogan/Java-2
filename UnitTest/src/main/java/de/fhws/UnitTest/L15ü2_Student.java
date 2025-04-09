package de.fhws.UnitTest;

public class L15ü2_Student extends L15ü2_Person {
	String fach;
    public L15ü2_Student(String fach) {
        this.fach = fach;
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Student besucht das Fach " + this.fach);
    }
}
