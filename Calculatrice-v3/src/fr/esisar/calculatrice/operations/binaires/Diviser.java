package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Diviser extends OperationBinaire {

	
	/**
	 * Récupère le symbole de l'opération Diviser
	 */
	@Override
	public String getNom() {
		return "/";
	}

	
	/**
	 * Calcule la division entre deux opérandes de type double 
	 */
	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1/operande2;
	}

}
