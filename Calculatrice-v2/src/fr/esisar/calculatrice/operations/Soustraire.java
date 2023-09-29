package fr.esisar.calculatrice.operations;

public class Soustraire implements Operation {


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
	public Double calculer(Double operande1, Double operande2) {

		return operande1 - operande2;
	}

}
