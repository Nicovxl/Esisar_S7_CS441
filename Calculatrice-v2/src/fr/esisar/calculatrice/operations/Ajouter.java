package fr.esisar.calculatrice.operations;

public class Ajouter implements Operation {

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
	public Double calculer(Double operande1, Double operande2) {

		return operande1 + operande2;
	}

}
