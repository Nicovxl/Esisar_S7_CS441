package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste {
	
	
	/**
	 * Récupère le symbole de l'opérateur maximum
	 */
	@Override
	public String getNom() {
		return "max";
	}
	
	
	/**
	 * Trouve le maximum dans une liste de nombres 
	 */
	@Override
	protected Double doCalculer(Double[] operandes) {
		Double max = operandes[0];
		for(Double op : operandes) {
			
			if(op > max) {
				
				max = op;
				
			}
			
		}
		
		return max;
	}

}
