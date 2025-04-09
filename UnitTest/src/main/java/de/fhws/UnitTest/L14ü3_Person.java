package de.fhws.UnitTest;

public class L14ü3_Person {
	private String vorname;
    private String nachname;
    private L14ü3_Adresse adresse;
    
    public L14ü3_Person(String vorname, String nachname, L14ü3_Adresse adresse) {
    	if (vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z' &&
            adresse.getOrt().charAt(0) >= 'A' && adresse.getOrt().charAt(0) <= 'Z' &&
            adresse.getStrasse().charAt(0) >= 'A' && adresse.getStrasse().charAt(0) <= 'Z' &&
            adresse.getHausnummer().charAt(0) >= '0' && adresse.getHausnummer().charAt(0) <= '9') { 
    		
    		this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
            
        } else {
        	throw new RuntimeException("Ungültige Daten");
        }
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public L14ü3_Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(L14ü3_Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

}
