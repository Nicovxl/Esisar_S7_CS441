package fr.esisar.calculatrice.operations.binaires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class SoustraireTest {
	private final Soustraire soustraire = new Soustraire();
	
	// ********************************************************************************************//
	
	@Test
	void soustraireEntierPositifPositifResultatPositif() throws CalculatriceException {
		assertEquals(1d,soustraire.calculer(3d,2d));
	}
	
	@Test
	void soustraireEntierPositifPositifResultatNull() throws CalculatriceException {
		assertEquals(0d,soustraire.calculer(3d,3d));
	}
	
	@Test
	void soustraireEntierPositifPositifResultatNegatif() throws CalculatriceException {
		assertEquals(-1d,soustraire.calculer(3d,4d));
	}

	// ********************************************************************************************//

	@Test
	void soustraireEntierNegatifNegatifResultatNegatif() throws CalculatriceException {
		assertEquals(-1d,soustraire.calculer(-3d,-2d));
	}
	
	@Test
	void soustraireEntierNegatifNegatifResultatNull() throws CalculatriceException {
		assertEquals(0d,soustraire.calculer(-3d,-3d));
	}
	
	@Test
	void soustraireEntierNegatifNegatifResultatPositif() throws CalculatriceException {
		assertEquals(1d,soustraire.calculer(-3d,-4d));
	}
	
	@Test
	void soustraireEntierNegatifNegatifResultatPositif2() throws CalculatriceException {
		assertEquals(6d,soustraire.calculer(-3d,-9d));
	}
	
	@Test
	void soustraireEntierPositifNegatifResultatPositif() throws CalculatriceException {
		assertEquals(12d,soustraire.calculer(3d,-9d));
	}
	// ********************************************************************************************//
	
	@Test
	void soustraireEntierNullPositif() throws CalculatriceException {
		assertEquals(-9d,soustraire.calculer(0d,9d));
	}
	
	@Test
	void soustraireEntierPositifNull() throws CalculatriceException {
		assertEquals(9d,soustraire.calculer(9d,0d));
	}
	
	@Test
	void soustraireEntierNullNull() throws CalculatriceException {
		assertEquals(0d,soustraire.calculer(0d,0d));
	}
	
	// ********************************************************************************************//
	

	@Test
	void soustraireFlottant() throws CalculatriceException {
		assertEquals(0.5d, soustraire.calculer(2.5d,2d));
	}
	
	@Test
	void soustraireFlottant2() throws CalculatriceException {
		assertEquals(0.9d, soustraire.calculer(2.9d,2d));
	}
	
	@Test
	void soustraireFlottant3() throws CalculatriceException {
		assertEquals(1.1d, soustraire.calculer(3.1d,2d));
	}
	
	@Test
	void soustraireDeuxFlottants() throws CalculatriceException {
		assertEquals(-0.3d, soustraire.calculer(2.5d,2.8d));
	}
	
	@Test
	void soustraireDeuxFlottants2() throws CalculatriceException {
		assertEquals(-0.8d, soustraire.calculer(2.5d,3.3d));
	}
	
	// ********************************************************************************************//
	
	@Test
	void soustraireGrandNombre() throws CalculatriceException {
		assertEquals(0d, soustraire.calculer(1800000000000000000d,1800000000000000000d));
	}
	
	@Test
	void soustraireGrandNombre2() throws CalculatriceException {
		assertEquals(-10000000000000000d, soustraire.calculer(1800000000000000000d,1810000000000000000d));
	}
	
	@Test
	void soustraireGrandNombre3() throws CalculatriceException {
		assertEquals(-100000000d, soustraire.calculer(18000000000d,18100000000d));
	}

	
	// ********************************************************************************************//

	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("-", soustraire.getNom());
	}
}
