package dice.joueur;

public class Joueur {

	private De de;

	public Joueur(De de) {
		this.de = de;
	}

	public int lancer() {
		return de.lancer();
	}
}
