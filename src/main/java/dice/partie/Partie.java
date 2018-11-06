package dice.partie;

import dice.joueur.Joueur;

public class Partie {

	private Pointage pointage;
	private Joueur joueurA;
	private Joueur joueurB;

	public Partie(Pointage pointage, Joueur joueurA, Joueur joueurB) {
		this.pointage = pointage;
		this.joueurA = joueurA;
		this.joueurB = joueurB;
	}

	public void jouer() {
		int lancerA = joueurA.lancer();
		int lancerB = joueurB.lancer();
		if (lancerA >= lancerB) {
			pointage.joueurA();
		} else {
			pointage.joueurB();
		}
	}
}
