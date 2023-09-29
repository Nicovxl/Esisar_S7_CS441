package fr.esisar.calculatrice;

/**
 * Classe main permettant de tester les méthodes de la classe calculatrice
 */
public class Calculateur {


/**
 * 	Méthode main de test
 * @param args Opérandes à taper au clavier
 */
public static void main(String[] args) {
	
		Calculatrice calculatrice = new Calculatrice();
	
		System.out.println(calculatrice.ajouter(2,2));
		System.out.println(calculatrice.soustraire(4,2));
		System.out.println(calculatrice.multiplier(3,3));
		System.out.println(calculatrice.diviser(2,2));

		
	}

}


