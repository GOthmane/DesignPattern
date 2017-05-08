package metier;

public class Expresso extends Boisson {
	
	public Expresso() {
		super();
		description = "Expresso";	
	}

	@Override
	public double cout() {
		return 1.99;
	}

}
