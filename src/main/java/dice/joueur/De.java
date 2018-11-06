package dice.joueur;

import java.util.Random;

public class De {

	private Random random;

	public De(Random random) {
		this.random = random;
	}

	public int lancer() {
		return random.nextInt(7);
	}
}
