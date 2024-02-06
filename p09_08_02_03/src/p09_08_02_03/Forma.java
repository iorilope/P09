/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_08_02_03;

/**
 * 
 * @author Ioritz Lopetegi
 */
public abstract class Forma {

	/** The izena string. */
	protected String izenaString;

	/** The id. */
	protected int id;

	/**
	 * To string.
	 *
	 * @return string
	 */
	public abstract String toString();

	/**
	 * Gets the izena.
	 *
	 * @return the izena
	 */
	public String getIzena() {
		return izenaString;
	}

	/**
	 * Gets the id.
	 *
	 * @return id
	 */
	public void id() {
		System.out.println(id + " da bere id-a");
		;
	}

	/**
	 * Sets the id.
	 *
	 * @param id_a the id
	 */
	public void SetId(int id_a) {
		this.id = id_a;
	}

}
