package dice;

import java.util.Random;

import dice.joueur.Joueur;
import dice.partie.*;

public class Main {

	public static void main(String[] args) {

		final int POINTS_GAGNANTS = 5;

		Random random = new Random(System.currentTimeMillis());
		Pointage pointage = new Pointage();
		Joueur joueurA = new Joueur(random);
		Joueur joueurB = new Joueur(random);
		Partie partie = new Partie(pointage, joueurA, joueurB);

		while (!pointage.hasGagnant(POINTS_GAGNANTS)) {
			partie.jouer();
		}

		System.out.println("Pointage: " + pointage.toString());
	}
}
