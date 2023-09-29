package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Ajouter;
import fr.esisar.calculatrice.operations.Diviser;
import fr.esisar.calculatrice.operations.Multiplier;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.Soustraire;

public class Calculateur {

	public static void main(String[] args) throws CalculatriceException {
		
		
		Double operande1 = 2.0;
		Double operande2 = 4.0;
		Double operande3 = 0.0;
		
		Set<Operation> operations1 = new HashSet<>();
		Set<Operation> operations2 = new HashSet<>();
		
		Operation add = new Ajouter();
		Operation sub = new Soustraire();
		Operation mul = new Multiplier();
		Operation div = new Diviser();
		
		operations1.add(add);
		operations1.add(sub);
		operations1.add(mul);
		operations1.add(div);
		
		operations2.add(add);
		operations2.add(div);
		
		Calculatrice c1 = new Calculatrice(operations1);
		Calculatrice c2 = new Calculatrice(operations2);

		System.out.println(c1.calculer("+", operande1, operande2));
		System.out.println(c1.calculer("-", operande1, operande2));
		System.out.println(c1.calculer("*", operande1, operande2));
		System.out.println(c1.calculer("/", operande1, operande2));
		
		System.out.println(c2.calculer("*", operande1, operande3));
		System.out.println(c2.calculer("/", operande1, operande3));
		

	}

}
