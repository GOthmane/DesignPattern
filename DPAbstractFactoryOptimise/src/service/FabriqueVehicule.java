package service;

import metier.Automobile;
import metier.Scooter;

public interface FabriqueVehicule {
	
	public Automobile créerAutomobile(String modele, String couleur, int puissance, double espace);
	public Scooter créerScooter(String modele, String couleur, int puissance);

}
