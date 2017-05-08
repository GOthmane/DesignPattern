package metier;

public abstract class DecoratorIngredients extends Boisson {
	
	protected Boisson boisson;

	public DecoratorIngredients(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	
	public abstract String getDescription();

}
