package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;


/**
 * Gère les différentes oprérations binaires possibles.
 */

public abstract class OperationBinaire implements Operation {

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException{
		if(operandes.length != 2) {
			
			throw new CalculatriceException("NombreOpérandesInsuffisant");
		}
		return doCalculer(operandes[0], operandes[1]);
	}

	protected abstract Double doCalculer(Double operande1, Double operande2) throws CalculatriceException;
}
