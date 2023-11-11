package fr.esisar.calculatrice.operations.ensemblistes;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import fr.esisar.calculatrice.CalculatriceException;

public class MinimumTest {

    private final Minimum minimum = new Minimum();
    
    @Test
	void shouldGetNomMinSign() {
		assertEquals("min", minimum.getNom());
	}
    
    @Test 
    void minimumPositifEntier() throws CalculatriceException {
        assertEquals(2d, minimum.calculer(2d, 4d, 6d, 8d, 10d));
    }

    @Test
    void minimumNegatifEntier() throws CalculatriceException {
        assertEquals(-10d, minimum.calculer(-10d, -4d, -6d, -8d, -2d));
    }

    @Test
    void minimumDecimaux() throws CalculatriceException {
        assertEquals(2.3d, minimum.calculer(2.3d, 4.5d, 6.8d, 8.1d, 15.7d));
    }

    @Test
    void minimumDecimauxPositifNegatif() throws CalculatriceException {
        assertEquals(-6.7d, minimum.calculer(-2.4d, 4.5d, -6.7d, 8.9d, -1.2d));
    }

    @Test
    void minimumUnSeulElement() throws CalculatriceException {
        assertEquals(3.14d, minimum.calculer(3.14d));
    }

    @Test 
    void minimumAlternantPositifNegatif1() throws CalculatriceException {
        assertEquals(-6.7d, minimum.calculer(-2.4d, 4.5d, -6.7d, 8.9d, -1.2d));
    }
    
    @Test
    void minimumAlternantPositifNegatif2() throws CalculatriceException {
        assertEquals(-6.7d, minimum.calculer(8.9d, -2.4d, 4.5d, -6.7d, -1.2d));
    }

    @Test
    void minimumAlternantPositifNegatif3() throws CalculatriceException {
        assertEquals(-6.7d, minimum.calculer(-1.2d,  -2.4d, 4.5d, -6.7d, 8.9d));
    }

    @Test
    void minimumAlternantPositifNegatifDecimaux1() throws CalculatriceException {
        assertEquals(2.3d, minimum.calculer(2.3d, 4.5d, 6.8d, 8.1d, 15.7d));
    }
        
    @Test
    void minimumAlternantPositifNegatifDecimaux2() throws CalculatriceException {
        assertEquals(2.3d, minimum.calculer(15.7d, 2.3d, 4.5d, 6.8d, 8.1d));
    }
        
    @Test
    void minimumAlternantPositifNegatifDecimaux3() throws CalculatriceException {
        assertEquals(2.3d, minimum.calculer(8.1d, 15.7d, 2.3d, 4.5d, 6.8d));
    }
}
