package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Soustraire extends OperationBinaire {
	
	
	/**
	 * Récupère le symbole de l'opération Soustraire
	 */
	@Override
	public String getNom() {
		return "-";
		
	}
	
	
	/**
	 * Calcule la soustraction entre deux opérandes de type double 
	 */
	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1 - operande2;
		
	}

}
