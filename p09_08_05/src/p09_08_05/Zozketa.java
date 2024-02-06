/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_08_05;

/**
 * 
 * @author Ioritz Lopetegi
 */
public abstract class Zozketa {

	/** The aukerak. */
	protected int aukerak;

	/** The zenbakiak. */
	protected int zenbakiak;

	/**
	 * Jaurti.
	 *
	 * @return the int
	 */
	public abstract int jaurti();

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Dado{" + "Zenbakia=" + zenbakiak + '}';
	}
}
