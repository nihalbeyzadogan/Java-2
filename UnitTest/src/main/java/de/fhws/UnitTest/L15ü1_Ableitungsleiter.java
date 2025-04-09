package de.fhws.UnitTest;


class L15ü1_Abteilungsleiter extends L15ü1_Angestellter {
    
    public L15ü1_Abteilungsleiter(String name, int id, String vorname, int grundgehalt, String geburtsdatum) {
        super(name, id, vorname, grundgehalt, geburtsdatum);
        setGehaltsfaktor(2); 
    }

    public void befoerdern(L15ü1_Angestellter angestellter) {
        double neuerFaktor = angestellter.getGehaltsfaktor() * 1.1; // gehaltsfaktor um %10 erhöhen mit 1.1
        angestellter.setGehaltsfaktor(neuerFaktor);
        //if(!(
    }
}
