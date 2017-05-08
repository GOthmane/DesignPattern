package metier;

public class Colvert extends Canard {
	
	public Colvert(){
		super();
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un colvert");
	}

}
