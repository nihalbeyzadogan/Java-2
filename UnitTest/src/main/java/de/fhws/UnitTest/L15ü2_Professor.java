package de.fhws.UnitTest;

public class L15ü2_Professor extends L15ü2_Person{
	String fach;
    public L15ü2_Professor(String fach) {
        this.fach = fach;
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Professor besucht das Fach " + this.fach);
    }
}
