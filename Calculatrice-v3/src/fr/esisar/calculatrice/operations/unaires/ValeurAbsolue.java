package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;


public class ValeurAbsolue extends OperationUnaire {
	
	/**
	 * Récupère le symbole de l'opérateur valeur absolue
	 */
	@Override
	public String getNom() {
		return "abs";
	}
	
	
	/**
	 * Calcule de valeur absolue  d'un nombre
	 */
	@Override
	protected Double doCalculer(Double operande1) {
		return Math.abs(operande1);
	}

}
