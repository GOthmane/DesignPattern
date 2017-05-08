package metier;

public class Caramel extends DecoratorIngredients {

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+", Caramel";
	}

	@Override
	public double cout() {
		return 0.22+boisson.cout();
	}

}
