package fr.esisar.calculatrice.operations.binaires;



import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class AjouterTest {
	private final Ajouter ajouter = new Ajouter();
	
	@Test
	void additionentierPositifPositif() throws CalculatriceException {
		assertEquals(4d,ajouter.calculer(2d,2d));
	}
	
	@Test
	void additionentierPositifNegatif() throws CalculatriceException {
		assertEquals(0d, ajouter.calculer(2d,-2d));
	}
	
	@Test
	void additionentierNegatifPositif() throws CalculatriceException {
		assertEquals(0d, ajouter.calculer(-2d,2d));
	}
	
	@Test
	void additionentierNegatifNegatif() throws CalculatriceException {
		assertEquals(-4d, ajouter.calculer(-2d,-2d));
	}
	
	
	//**********************************************************************************//

	@Test
	void additionentierPositifNegatifChiffresDifferents() throws CalculatriceException {
		assertEquals(-1d, ajouter.calculer(-3d,2d));
	}
	
	@Test
	void additionentierNegatifPositifChiffresDifferents() throws CalculatriceException {
		assertEquals(1d, ajouter.calculer(3d,-2d));
	}
	
	@Test
	void additionentierNegatifZeros() throws CalculatriceException {
		assertDoesNotThrow( () -> ajouter.calculer(-3d,0d) );
	}

	@Test
	void additionentierPositifZeros() throws CalculatriceException {
		assertDoesNotThrow( () -> ajouter.calculer(3d,0d) );
	}
	
	//**********************************************************************************//
	
	@Test
	void additionflottant() throws CalculatriceException {
		assertEquals(4.5d, ajouter.calculer(2.5d,2d));
	}
	
	@Test
	void additionflottantPositifNegatif() throws CalculatriceException {
		assertEquals(0.5d, ajouter.calculer(2.5d,-2d));
	}
	
	@Test
	void additionDeuxFlottants() throws CalculatriceException {
		assertEquals(-5.3d, ajouter.calculer(-2.5d,-2.8d));
	}
	//******************************************************************************************//
	
	@Test
	void additionGrandNombre() throws CalculatriceException {
		assertEquals(-3600000000000000000d, ajouter.calculer(-1800000000000000000d,-1800000000000000000d));
	}

	//********************************************************************************************//
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("+", ajouter.getNom());
	}
	
	@Test
	void testOneArgument() throws CalculatriceException {
		assertThrows(CalculatriceException.class ,() -> ajouter.calculer());
	}
	
	
	
}
