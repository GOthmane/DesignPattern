package presentation;

import metier.Canard;
import metier.CanardEnPlastique;
import metier.CoinCoin;
import metier.Colvert;
import metier.Leurre;
import metier.VolerAvecDesAiles;

public class Lanceur {

	public static void main(String[] args) {
		
		Canard colvert = new Colvert();
		colvert.afficher();
		colvert.nager();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		System.out.println("---------------------------");
		Canard leurre = new Leurre();
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
		System.out.println("---------------------------");
		Canard canardplastique = new CanardEnPlastique();
		canardplastique.afficher();
		canardplastique.nager();
		canardplastique.effectuerCancan();
		canardplastique.effectuerVol();
		System.out.println("---------------------------");
		leurre.setComportementCancan(new CoinCoin());
		leurre.setComportementVol(new VolerAvecDesAiles());
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
	}

}
