package service;

import metier.Automobile;
import metier.Scooter;

public interface FabriqueVehicule {
	
	public Automobile cr�erAutomobile(String modele, String couleur, int puissance, double espace);
	public Scooter cr�erScooter(String modele, String couleur, int puissance);

}
