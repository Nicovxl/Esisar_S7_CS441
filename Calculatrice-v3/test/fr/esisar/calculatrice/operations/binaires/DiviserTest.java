package fr.esisar.calculatrice.operations.binaires;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class DiviserTest {
	private final Diviser diviser = new Diviser();
	
	
	// ********************************************************************************************//

	@Test
	void diviserEntierPositifPositif() throws CalculatriceException {
		assertEquals(3d, diviser.calculer(6d, 2d));
	}
	
	@Test
	void diviserEntierPositifNegatif() throws CalculatriceException {
		assertEquals(-3d, diviser.calculer(6d, -2d));
	}
	
	@Test
	void diviserEntierNegatifPositif() throws CalculatriceException {
		assertDoesNotThrow(() ->  diviser.calculer(-6d, 2d));
	}
	
	@Test
	void diviserEntierPositifNegatif2() throws CalculatriceException {
		assertEquals(-3d, diviser.calculer(18d, -6d));
	}
	

	@Test
	void diviserEntierPositifNegatif3() throws CalculatriceException {
		assertEquals(-0.1d, diviser.calculer(18d, -180d));
	}
	
	@Test
	void diviserEntierNegatifNegatif() throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(-4d, -2d));
	}
	
	@Test
	void diviserEntierNegatifNegatif2() throws CalculatriceException {
		assertDoesNotThrow(() ->  diviser.calculer(-2d, -1d));
	}
	
	@Test
	void diviserFlottant2() throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(1.0d, 4d));
	}
	@Test
	void diviserFlottant3() throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(3.0d, 4d));
	}
	// ********************************************************************************************//
	@Test
	void diviserEntierIdentique() throws CalculatriceException {
		assertEquals(1d, diviser.calculer(-1d, -1d));
	}
	
	@Test
	void diviserEntierIdentique2() throws CalculatriceException {
		assertEquals(1d, diviser.calculer(4d, 4d));
	}
	
	// ********************************************************************************************//
	
	@Test
	void diviserEntierParNull() throws CalculatriceException {
		assertThrows(CalculatriceException.class, () ->  diviser.calculer(-2d, 0d));
	}
	
	@Test
	void diviserEntierParNull2() throws CalculatriceException {
		assertThrows(CalculatriceException.class, () ->  diviser.calculer(2d, 0d));
	}
	
	// ********************************************************************************************//
	@Test
	void diviserFlottant() throws CalculatriceException {
		assertEquals(1.4d, diviser.calculer(3.5d, 2.5d));
	}
	
	
	// ********************************************************************************************//
	
	
	@Test
	void diviserGrandNombre() throws CalculatriceException {
		assertEquals(10d, diviser.calculer(1000000000000d, 100000000000d));
	}
	
	// ********************************************************************************************//
	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("/", diviser.getNom());
	}
}
