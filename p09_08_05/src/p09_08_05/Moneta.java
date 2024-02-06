/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_08_05;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Moneta extends Zozketa {

	/**
	 * Jaurti.
	 *
	 * @return the int
	 */
	@Override
	public int jaurti() {

		return (int) (Math.random() * aukerak + 1);
	}

	/**
	 * Instantiates a new moneta.
	 */
	public Moneta() {

		aukerak = 2;

	}

}
