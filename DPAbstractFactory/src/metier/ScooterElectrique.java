package metier;

public class ScooterElectrique extends Scooter {

	public ScooterElectrique(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void affichercaracteristiques() {
		System.out.println("Scooter électrique de modèle "+ modele + 
				", de couleur "+ couleur + 
				", de puissance "+ puissance);
	}

}
