package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Cosinus extends OperationUnaire {
	
	/**
	 * Récupère le symbole de l'opérateur cosinus
	 */
	@Override
	public String getNom() {
		return "cos";
	}
	
	/**
	 * Calcule de cosinus d'un nombre
	 */
	@Override
	protected Double doCalculer(Double operande1) {
		return Math.cos(operande1);
	}

}
