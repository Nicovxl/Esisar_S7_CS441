package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Gère les différentes oprérations ensemblistes possibles.
 */

public abstract class OperationEnsembliste implements Operation {

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length == 0) {
			
			throw new CalculatriceException("NombreOpérandesInsuffisant");
			
		}
			
		return doCalculer(operandes);	
	}

	protected abstract Double doCalculer(Double[] operandes);
}
