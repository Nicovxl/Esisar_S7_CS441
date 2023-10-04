package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Tangente extends OperationUnaire {
	
	/**
	 * Récupère le symbole de l'opérateur tangente
	 */
	@Override
	public String getNom() {
		return "tan";
	}
	
	/**
	 * Calcule de tangente d'un nombre
	 */
	@Override
	protected Double doCalculer(Double operande1) {
		return Math.tan(operande1);
	}

}
