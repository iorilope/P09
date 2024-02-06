/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_04;

/**
 * The Class Arduraduna.
 */
public class Arduraduna extends Langilea {

	/** The p. */
	private String p;

	/**
	 * Gets the soldata.
	 *
	 * @return soldata
	 */
	public int getSoldata() {
		Double d = Double.valueOf(soldataOinarria * 1.1);
		return d.intValue();
	}

	/**
	 * Sets the postua.
	 *
	 * @param postua new postua
	 */
	public void setPostua(String postua) {
		p = postua;
	}

	/**
	 * Gets the postua.
	 *
	 * @return postua
	 */
	public String getpostua() {

		return p;
	}

}