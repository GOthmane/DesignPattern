package service;

import metier.Automobile;
import metier.AutomobileElectrique;
import metier.Scooter;
import metier.ScooterElectrique;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Automobile créerAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileElectrique(modele,couleur,puissance,espace);
	}

	@Override
	public Scooter créerScooter(String modele, String couleur, int puissance) {
		return new ScooterElectrique(modele,couleur,puissance);
	}

}
