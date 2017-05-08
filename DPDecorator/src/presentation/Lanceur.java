package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Chocolat;
import metier.Colombia;
import metier.Expresso;

public class Lanceur {
	
public static void main(String[] args) {
		
	Boisson b1 = new Expresso();
	Boisson b2 = new Colombia();
	b2 = new Caramel(b2);
	b2 = new Chocolat(b2);
	
	System.out.println(b1.getDescription() + ", coût = " + b1.cout());
	System.out.println(b2.getDescription() + ", coût = " + b2.cout());

	}

}
