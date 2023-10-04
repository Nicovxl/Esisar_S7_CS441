package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;


/**
 * Gère les différentes oprérations unaires possibles.
 */
public abstract class OperationUnaire implements Operation {

	
	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		
		if(operandes.length != 1) {
			
			throw new CalculatriceException("NombreOpérandesInsuffisant");
			
		}
			
		return doCalculer(operandes[0]);	
	}

	protected abstract Double doCalculer(Double operande1);


}


