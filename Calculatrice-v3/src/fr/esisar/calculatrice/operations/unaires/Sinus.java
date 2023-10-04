package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Sinus extends OperationUnaire {
	
	/**
	 * Récupère le symbole de l'opérateur sinus
	 */
	@Override
	public String getNom() {
		return "sin";
	}

	/**
	 * Calcule de sinus d'un nombre
	 */
	@Override
	protected Double doCalculer(Double operande1) {
		return Math.sin(operande1);
	}

}
