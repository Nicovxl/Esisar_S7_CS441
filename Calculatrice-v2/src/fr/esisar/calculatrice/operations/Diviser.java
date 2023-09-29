package fr.esisar.calculatrice.operations;


public class Diviser implements Operation {

	
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
	public Double calculer(Double operande1, Double operande2){
		
			
		return operande1 / operande2;
	
	
	}
	
}
