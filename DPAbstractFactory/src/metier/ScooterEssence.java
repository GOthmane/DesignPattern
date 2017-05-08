package metier;

public class ScooterEssence extends Scooter {

	public ScooterEssence(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void affichercaracteristiques() {
		System.out.println("Scooter à essence de modèle "+ modele + 
				", de couleur "+ couleur + 
				", de puissance "+ puissance);
	}

}
