package service;

import metier.Automobile;
import metier.AutomobileEssence;
import metier.Scooter;
import metier.ScooterEssence;

public class FabriqueVehiculeEssence implements FabriqueVehicule {

	@Override
	public Automobile créerAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileEssence(modele,couleur,puissance,espace);
	}

	@Override
	public Scooter créerScooter(String modele, String couleur, int puissance) {
		return new ScooterEssence(modele,couleur,puissance);
	}

}
