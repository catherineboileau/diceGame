package dice.joueur;

import java.util.Random;

public class Joueur {

	private Random random;

	public Joueur(Random random) {
		this.random = random;
	}

	public int lancer() {
		return random.nextInt(7);
	}
}
