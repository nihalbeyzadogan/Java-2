package de.fhws.UnitTest;

public class L15ü1_Angestellter {
	   	private String name;
	    private String vorname;
	    private int id;
	    private int grundgehalt;
	    private double gehaltsfaktor;
	    private String geburtsdatum;
	    
	    public L15ü1_Angestellter(String name, int id, String vorname, int grundgehalt, String geburtsdatum) {
	        this.name = name;
	        this.id = id;
	        this.vorname = vorname;
	        this.grundgehalt = grundgehalt;
	        this.gehaltsfaktor = 1; 
	        this.geburtsdatum = geburtsdatum;
	    }
	    

	    public int getGrundgehalt() {
	        return grundgehalt;
	    }

	    public void setGrundgehalt(int grundgehalt) {
	        this.grundgehalt = grundgehalt;
	    }

	    public String getGeburtsdatum() {
	        return geburtsdatum;
	    }

	    public void setGeburtsdatum(String geburtsdatum) {
	        this.geburtsdatum = geburtsdatum;
	    }

	    public double getGehaltsfaktor() {
	        return gehaltsfaktor;
	    }

	    public void setGehaltsfaktor(double gehaltsfaktor) {
	        this.gehaltsfaktor = gehaltsfaktor;
	    }

	    public double getGehalt() {
	        return grundgehalt * gehaltsfaktor; //*
	    }
	}
