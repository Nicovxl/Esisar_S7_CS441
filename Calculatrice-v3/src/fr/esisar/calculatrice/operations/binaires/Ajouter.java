package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;



public class Ajouter extends OperationBinaire {
	
	/**
	 * Récupère le symbole de l'opération Additionner
	 */
	@Override
	public String getNom() {
		return "+";
	}
	
	/**
	 * Calcule l'addition entre deux opérandes de type double 
	 */
	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1 + operande2;
	}

}
