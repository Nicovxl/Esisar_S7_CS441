package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

/**
 * Permet de calculer des nombres réels en utilisant des opérations parmi celles implémentées
 * @author nicovxl
 *
 */
public class Calculatrice {

	Set<Operation> operations = new HashSet<>();

	
	
	
	public Calculatrice(Set<Operation> operations) {
		super();
		this.operations = operations;
	}
	
	/**
	 * Permet de chercher le signe des opérations possibles au sein d'un set
	 * @param nom Nom de l'opération
	 * @return Retourne l'opération si trouvée parmi celles proposées
	 */
	public Operation chercherOperation(String nom) {

		for (Operation op : operations) {

			if (op.getNom() == nom) {

				return op;

			}

		}

		return null;

	}
	
	/**
	 * 
	 * @param nom Nom de l'opération parmi celles proposées
	 * @param operande1 Terme ou facteur de gauche 
	 * @param operande2 Terme ou facteur de droite
	 * @return Retourne le résultat de l'opération si cette dernière a pu être calculée
	 * @throws CalculatriceException "OperationInvalide" si l'opération n'existe pas ou si il y a division par zéro
	 */
	public Double calculer(String nom, Double... operandes) throws CalculatriceException {

		Operation op = chercherOperation(nom);

		if(op == null) throw new CalculatriceException("OperationInvalide\n");
			
			return (op.calculer(operandes));


	}
	
	
	/** 
	 * Ajoute une opération au Set operations
	 * @param operation Opération que l'on souhaite ajouter au Set
	 */
	public void ajouterOperation(Operation operation) {

		operations.add(operation);

	}

}
