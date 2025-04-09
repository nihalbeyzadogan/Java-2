package de.fhws.UnitTest;

public class L14ü2_Punkt {
	 int x;
	 int y;
	 
	 public void verschiebePunkt(int zielX, int zielY) {
		 if(zielX<0||zielY<0||zielX>1920|| zielY>1080) throw new RuntimeException("Ungültige Koordinaten");
		 x = zielX;
		 y = zielY;
	 }
}
