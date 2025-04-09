package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L14ü2_PunktTest {

	@Test
	public void testVerschiebePunkt() {
		L14ü2_Punkt p = new L14ü2_Punkt();
		assertThrows(RuntimeException.class, () -> {p.verschiebePunkt(1990,1200); });
	}
	
	@Test
	public void testGültigePunkt() {
		L14ü2_Punkt p = new L14ü2_Punkt();
        p.verschiebePunkt(1000, 500);
        assertEquals(1000, p.x);
        assertEquals(500, p.y);
	}

}
