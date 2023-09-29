package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Interface qui gère les actions liées à une Opération 
 */
public interface Operation {
	
	public String getNom();

	public Double calculer(Double operande1, Double operande2);

}
