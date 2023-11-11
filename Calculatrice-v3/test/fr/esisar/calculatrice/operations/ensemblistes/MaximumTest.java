package fr.esisar.calculatrice.operations.ensemblistes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class MaximumTest {

	private final Maximum maximum = new Maximum();

	@Test
	void shouldGetNomMaxSign() {
		assertEquals("max", maximum.getNom());
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Test
	void testMaximum() throws CalculatriceException {
	    assertEquals(5d, maximum.calculer(1d,2d,3d,4d,5d)); // -> 1.0
	}

	@Test
	void testMaximumDecroissant() throws CalculatriceException {
	    assertEquals(5d, maximum.calculer(5.0d, 4.0d, 3.0d, 2.0d, 1.0d)); // -> 4.0
	}
	
	// On peut déduire que le résultat dépend de l'ordre
	
	@Test
	void testMaximumDecroissant2() throws CalculatriceException {
	    assertEquals(5d, maximum.calculer(3.0d, 2.0d, 1.0d,5.0d, 4.0d)); // -> 2.0
	}
	
	@Test
	void testMaximumDecroissant3() throws CalculatriceException {
	    assertEquals(5d, maximum.calculer(2.0d, 3.0d, 1.0d,5.0d, 4.0d)); // -> 2.0
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	// Semble retourner minimum de deux premiers arguments 
	

	@Test
	void testMin2premier() throws CalculatriceException {
	    assertEquals(18465d, maximum.calculer(645.0d, 35.0d,0d, 18465.0d,5.0d, 4.0d)); // -> 0.0
	}
	
	@Test
	void testMin2premier2() throws CalculatriceException {
	    assertEquals(18465d, maximum.calculer(645.0d, 35.0d,1d, 18465.0d,5.0d, 4.0d)); // -> 1.0
	}
	
	@Test
	void testMin2premier3() throws CalculatriceException {
	    assertEquals(18465d, maximum.calculer(5.0d, 3d,1d, 18465.0d,-5.0d, 4.0d)); // -> 1.0
	}
	
	@Test
	void testMin2premier4() throws CalculatriceException {
	    assertEquals(18465d, maximum.calculer(5.0d, 3d,1d, 18465.0d,-5.0d)); // -> 3.0
	}
	
	
	// minimum des deux premiers si un nombre impair d'argument sinon des trois premiers
	
//////////////////////////////////////////////////////////////////////////////////////////////

	// Cas pair d'arguments avec nombres positifs et négatifs
	@Test
	void testMinimumPairPositifNegatif() throws CalculatriceException {
	    assertEquals(4565d, maximum.calculer(10d, -5d, 3d,4565d,-800d,78d));
	}

	// Cas pair d'arguments avec nombres entiers négatifs
	@Test
	void testMinimumPairNombresEntiersNegatifs() throws CalculatriceException {
	    assertEquals(0d, maximum.calculer(-8d, -3d, -5d,-4565d,-800d,0d));
	}
	

	// Cas pair d'arguments avec nombres positifs
	@Test
	void testMinimumPairNombresPositifs() throws CalculatriceException {
	    assertEquals(4565d, maximum.calculer(3.2d, 5.7d,3.56d,4565d,800d,78d));
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// Cas impair d'arguments avec nombres entiers positifs
	@Test
	void testMinimumImpairNombresEntiersPositifs() throws CalculatriceException {
	    assertEquals(4565d, maximum.calculer(1d, 2d, 0d ,4565d,800d));
	}
		

	// Cas impair d'arguments avec nombres entiers négatifs
	@Test
	void testMinimumImpairNombresNegatifsDecimaux() throws CalculatriceException {
	    assertEquals(-10.2d, maximum.calculer(-15.3d, -10.2d, -102.5d));
	}


	// Cas impair d'arguments avec nombres positifs et négatifs
	@Test
	void testMinimumImpairPositifNegatifDecimaux() throws CalculatriceException {
	    assertEquals(658d, maximum.calculer(7.1d, -4.6d, -22.3d,-800d,0d,45d,658d));
	}

	//////////////ERREUR///////////////////////////////////////////////////////////////////////////
	
	// Mais ce cas fonctionne !! 
	@Test
	void testMinimumImpairPositifNegatifDecimaux2() throws CalculatriceException {
	    assertEquals(7.1d, maximum.calculer(7.1d, -4.6d, -22.3d,-800d,0d));
	}
	
	// Cas impair d'arguments avec nombres positifs et négatifs
		@Test
		void testMinimImpairPositifNegatifDecimaux3() throws CalculatriceException {
		    assertEquals(658d, maximum.calculer(7.1d, -4.6d, -22.3d,-800d,0d,45d,658d,75d,-58d));
		}
		
	/////////////////////////////// Minimum jusqu'au partEnt(Nombre arg /2)//////////////////////////////
	
		// 1 argument (1/2 = 0)
		@Test
		void testMaximumUnArgument() throws CalculatriceException {
		    assertEquals(-5.2d, maximum.calculer(-5.2d));
		}

		// 2 arguments (2/2 = 1)
		@Test
		void testMaximumDeuxArguments() throws CalculatriceException {
		    assertEquals(-1.2d, maximum.calculer(-1.2d, -3.1d));
		}

		// 3 arguments (3/2 = 1)
		@Test
		void testMaximumTroisArguments() throws CalculatriceException {
		    assertEquals(-1.8d, maximum.calculer(-1.8d, -2.3d, -4.7d));
		}

		// 4 arguments (4/2 = 2)
		@Test
		void testMaximumQuatreArguments() throws CalculatriceException {
		    assertEquals(-2.9d, maximum.calculer( -2.9d, -3.8d, -4.1d, -6.5d));
		}

		// 5 arguments (5/2 = 2)
		@Test
		void testMaximumCinqArguments() throws CalculatriceException {
		    assertEquals(-5.1d, maximum.calculer( -5.1d, -6.6d,-7.4d,-8.2d,  -9.0d));
		}

		// 6 arguments (6/2 = 3)
		@Test
		void testMaximumSixArguments() throws CalculatriceException {
		    assertEquals(-6.4d, maximum.calculer(-6.4d, -7.3d, -8.2d,-9.5d,-10.1d,-12.0d));
		}

		// 7 arguments (7/2 = 3)
		@Test
		void testMaximumSeptArguments() throws CalculatriceException {
		    assertEquals(12.6d, maximum.calculer( 12.6d,-9.1d,-10.4d,-11.9d, -13.7d, -14.2d,-15.3d));
		}

		// 8 arguments (8/2 = 4)
		@Test
		void testMaximumHuitArguments() throws CalculatriceException {
		    assertEquals(-12.7d, maximum.calculer(-12.7d, -13.6d, -14.5d, -15.9d, -16.3d, -17.8d, -18.2d, -19.0d));
		}

		// 9 arguments (9/2 = 4)
		@Test
		void testMaximumNeufArguments() throws CalculatriceException {
		    assertEquals(-11.9d, maximum.calculer(-11.9d, -12.3d, -13.2d, -14.6d, -15.4d, -16.5d, -17.8d, -18.7d, -19.9d));
		}
		
		@Test
		void testNoArguments(){
			assertThrows(CalculatriceException.class ,() -> maximum.calculer());
		}
		
		
		
		
}
