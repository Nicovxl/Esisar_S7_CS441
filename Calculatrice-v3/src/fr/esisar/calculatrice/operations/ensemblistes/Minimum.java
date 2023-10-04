package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste {
	
	/**
	 * Récupère le symbole de l'opérateur minimum
	 */
	@Override
	public String getNom() {
		return "min";
	}
	
	/**
	 * Trouve le minimum dans une liste de nombres 
	 */
	@Override
	protected Double doCalculer(Double[] operandes) {
		Double min = operandes[0];
		for(Double op : operandes) {
			
			if(op < min) {
				
				min = op;
				
			}
			
		}
		
		return min;
	}

}
