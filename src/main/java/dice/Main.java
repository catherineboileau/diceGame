package dice;

import java.util.Random;

import dice.joueur.*;
import dice.partie.*;

public class Main {

	public static void main(String[] args) {

		final int POINTS_GAGNANTS = 5;

		Pointage pointage = new Pointage();
		Random random = new Random(System.currentTimeMillis());
		De de = new De(random);
		Joueur joueurA = new Joueur(de);
		Joueur joueurB = new Joueur(de);
		Partie partie = new Partie(pointage, joueurA, joueurB);

		while (!pointage.hasGagnant(POINTS_GAGNANTS)) {
			partie.jouer();
		}

		System.out.println("Pointage: " + pointage.toString());
	}
}
