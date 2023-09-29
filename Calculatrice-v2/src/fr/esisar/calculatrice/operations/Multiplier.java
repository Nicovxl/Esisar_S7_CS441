package fr.esisar.calculatrice.operations;

public class Multiplier implements Operation{

	
	
	/**
	 * Récupère le symbole de l'opération Multiplier
	 */
	@Override
	public String getNom() {
		return "*";
	}
	
	/**
	 * Calcule la multiplication entre deux opérandes de type double 
	 */
	@Override
	public Double calculer(Double operande1, Double operande2) {
		
		return operande1 * operande2;
		
		
	}

}
