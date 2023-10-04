package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.binaires.Ajouter;
import fr.esisar.calculatrice.operations.binaires.Diviser;
import fr.esisar.calculatrice.operations.binaires.Multiplier;
import fr.esisar.calculatrice.operations.binaires.Soustraire;
import fr.esisar.calculatrice.operations.ensemblistes.Maximum;
import fr.esisar.calculatrice.operations.ensemblistes.Minimum;
import fr.esisar.calculatrice.operations.unaires.Cosinus;
import fr.esisar.calculatrice.operations.unaires.Sinus;
import fr.esisar.calculatrice.operations.unaires.Tangente;
import fr.esisar.calculatrice.operations.unaires.ValeurAbsolue;



public class Calculateur {

	public static void main(String[] args) throws CalculatriceException {
		
		
		Double operande1 = 2.0;
		Double operande2 = 4.0;
		Double operande3 = 0.0;
		Double operande4 = -10.0;
		
		Set<Operation> operations1 = new HashSet<>();
		Set<Operation> operations2 = new HashSet<>();
		Double T[] = {25.3, 31.2, 45.2, 87.0, 25.2};
		Double Tvide[] = {};
		
		Operation add = new Ajouter();
		Operation sub = new Soustraire();
		Operation mul = new Multiplier();
		Operation div = new Diviser();
		Operation cos = new Cosinus();
		Operation sin = new Sinus();
		Operation tan = new Tangente();
		Operation abs = new ValeurAbsolue();
		Operation min = new Minimum();
		Operation max = new Maximum();
		
		operations1.add(add);
		operations1.add(sub);
		operations1.add(mul);
		operations1.add(div);
		
		operations2.add(add);
		operations2.add(div);
		operations2.add(cos);
		operations2.add(sin);
		operations2.add(tan);
		operations2.add(abs);
		operations2.add(min);
		operations2.add(max);
		
		
		Calculatrice c1 = new Calculatrice(operations1);
		Calculatrice c2 = new Calculatrice(operations2);

		System.out.println(c1.calculer("+", operande1, operande2));
		System.out.println(c1.calculer("-", operande1, operande2));
		System.out.println(c1.calculer("*", operande1, operande2,operande4));
		System.out.println(c1.calculer("/", operande1));
		
		System.out.println(c2.calculer("*", operande1, operande3));
		System.out.println(c2.calculer("/", operande1, operande3));
		System.out.println(c2.calculer("cos",operande1, operande2,operande4));
		System.out.println(c2.calculer("min",Tvide));
		
		System.out.println(c2.calculer("cos", operande3));
		System.out.println(c2.calculer("sin", operande3));
		System.out.println(c2.calculer("tan", operande3));
		System.out.println(c2.calculer("abs", operande4));
		
		System.out.println(c2.calculer("min", T));
		System.out.println(c2.calculer("max", T));
		
		

	}

}