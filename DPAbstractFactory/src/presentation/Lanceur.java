package presentation;

import metier.Automobile;
import metier.Scooter;
import service.FabriqueVehicule;
import service.FabriqueVehiculeElectrique;
import service.FabriqueVehiculeEssence;

public class Lanceur {

	public static void main(String[] args) {
		
		FabriqueVehicule f1 = new FabriqueVehiculeElectrique();
		// Pas besoin de savoir la classe concr�te de auto1 pour la cr�er
		Automobile auto1 = f1.cr�erAutomobile("mercedes", "grise", 200, 180);
		
		FabriqueVehicule f2 = new FabriqueVehiculeEssence();
		Automobile auto2 = f2.cr�erAutomobile("mercedes", "rose", 300, 150);
		
		FabriqueVehicule f3 = new FabriqueVehiculeEssence();
		Scooter scooter1 = f3.cr�erScooter("peugeot", "rose", 200);
		
		FabriqueVehicule f4 = new FabriqueVehiculeElectrique();
		Scooter scooter2 = f4.cr�erScooter("peugeot", "rose", 100);
		
		auto1.affichercaracteristiques();
		auto2.affichercaracteristiques();
		scooter1.affichercaracteristiques();
		scooter2.affichercaracteristiques();

	}

}
