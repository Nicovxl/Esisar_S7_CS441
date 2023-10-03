package fr.esisar.calculatrice;

/**
 * Classe d'exception en cas d'opération invalide (qui n'a pas été trouvé parmi celles implémentées ou si il y a division par 0)
 * @author nicovxl
 *
 */
public class CalculatriceException extends Exception {

	
	private static final long serialVersionUID = 3199399757501023139L;
	private final String message;

	public CalculatriceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "CalculatriceException [message=" + message + "]";
	}

}
