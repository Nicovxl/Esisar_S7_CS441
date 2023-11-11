package fr.esisar.calculatrice.operations.binaires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class MultiplierTest {
	private final Multiplier multiplier = new Multiplier();

	// ********************************************************************************************//

	@Test
	void multiplierEntierPositifPositifResultatPositif() throws CalculatriceException {
		assertEquals(6d, multiplier.calculer(3d, 2d));
	}
	
	@Test
	void multiplierEntierPositifPositifResultatPositif2() throws CalculatriceException {
		assertEquals(6d, multiplier.calculer(2d, 3d));
	}
	
	
	@Test
	void multiplierEntierPositifNegatifResultatNegatif() throws CalculatriceException {
		assertEquals(-6d, multiplier.calculer(3d, -2d));
	}
	
	@Test
	void multiplierEntierPositifNegatifResultatNegatif2() throws CalculatriceException {
		assertEquals(-6d, multiplier.calculer(-2d, 3d));
	}
	
	
	@Test
	void multiplierEntierNegatifNegatifResultatPositif() throws CalculatriceException {
		assertEquals(6d, multiplier.calculer(-3d, -2d));
	}
	
	@Test
	void multiplierEntierNegatifNegatifResultatPositif2() throws CalculatriceException {
		assertEquals(6d, multiplier.calculer(-2d, -3d));
	}

	// ********************************************************************************************//
	@Test
	void multiplierEntierNegatifNullResultatNull() throws CalculatriceException {
		assertEquals(0d, multiplier.calculer(-3d, 0d));
	}
	
	@Test
	void multiplierEntierNullNullResultatNull() throws CalculatriceException {
		assertEquals(0d, multiplier.calculer(0d, 0d));
	}
	
	@Test
	void multiplierEntierPositifNullResultatNull() throws CalculatriceException {
		assertEquals(0d, multiplier.calculer(0d, 3d));
	}
	
	// ********************************************************************************************//
	@Test
	void multiplierFlottant() throws CalculatriceException {
		assertEquals(0.75d, multiplier.calculer(0.5d, 1.5d));
	}
	
	@Test
	void multiplierFlottant2() throws CalculatriceException {
		assertEquals(0.3d, multiplier.calculer(0.2d, 1.5d));
	}
	
	@Test
	void multiplierFlottant3() throws CalculatriceException {
		assertEquals(1.2d, multiplier.calculer(0.8d, 1.5d));
	}
	
	@Test
	void multiplierFlottant4() throws CalculatriceException {
		assertEquals(2.7d, multiplier.calculer(1.8d, 1.5d));
	}
	
	@Test
	void multiplierFlottant5() throws CalculatriceException {
		assertEquals(6.25d, multiplier.calculer(2.5d, 2.5d));
	}
	
	// ********************************************************************************************//
	
	@Test
	void multiplierGrandNombre() throws CalculatriceException {
		assertEquals(1000000000000d, multiplier.calculer(1000000d, 1000000d));
	}
	
	@Test
	void multiplierGrandNombre2() throws CalculatriceException {
		assertEquals(100000000d, multiplier.calculer(10000d, 10000d));
	}
	
	@Test
	void multiplierGrandNombre3() throws CalculatriceException {
		assertEquals(10000000000d, multiplier.calculer(100000d, 100000d));
	}

	// ********************************************************************************************//

	@Test
	void shouldGetNomPlusSign() {
		assertEquals("*", multiplier.getNom());
	}
}
