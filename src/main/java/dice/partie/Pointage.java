package dice.partie;

public class Pointage {

	private int joueurA;
	private int joueurB;

	public Pointage() {
		this.joueurA = 0;
		this.joueurB = 0;
	}

	public Pointage(int joueurA, int joueurB) {
		this();
		if (joueurA != 0) {
			this.joueurA = joueurA;
		}

		if (joueurB != 0) {
			this.joueurB = joueurB;
		}
	}

	public void joueurA() {
		this.joueurA += 1;
	}

	public void joueurB() {
		this.joueurB += 1;
	}

	public boolean hasGagnant(int pointsGagnants) {
		if (joueurA == pointsGagnants || joueurB == pointsGagnants) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Joueur A: " + joueurA + ", Joueur B: " + joueurB;
	}
}
