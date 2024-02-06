/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_07;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Karratua extends Irudia {

	/** The aldea. */
	private int aldea;

	/**
	 * Instantiates a new karratua.
	 *
	 * @param a the a
	 */
	Karratua(int a) {
		this.aldea = a;
	}

	/**
	 * Gets the azalera.
	 *
	 * @return the azalera
	 */
	public int getAzalera() {
		return aldea * aldea;
	}
}