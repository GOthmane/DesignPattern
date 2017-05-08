package metier;

public class CanardEnPlastique extends Canard {
	
	public CanardEnPlastique() {
		super();
		comportementCancan = new CoinCoin();
		comportementVol = new NePasVoler();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un canard en plastique");
	}

}
