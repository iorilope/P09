/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_02;


/**
 * The Class Forma.
 */
public abstract class Forma {
	
	/**
	 * Identitatea.
	 */
	public void identitatea() {
		System.out.println(this);
	}

	/**
	 * Inprimatu.
	 *
	 * @return the string
	 */
	public abstract String inprimatu();
}

public class Zirkulu extends Forma {
	public String inprimatu() {
		return "Zirkulua";
	}
}

public class Karratu extends Forma {
	public String inprimatu() {
		return "Karratua";
	}
}