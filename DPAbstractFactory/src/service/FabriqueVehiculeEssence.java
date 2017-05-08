package service;

import metier.Automobile;
import metier.AutomobileEssence;
import metier.Scooter;
import metier.ScooterEssence;

public class FabriqueVehiculeEssence implements FabriqueVehicule {

	@Override
	public Automobile cr�erAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileEssence(modele,couleur,puissance,espace);
	}

	@Override
	public Scooter cr�erScooter(String modele, String couleur, int puissance) {
		return new ScooterEssence(modele,couleur,puissance);
	}

}
