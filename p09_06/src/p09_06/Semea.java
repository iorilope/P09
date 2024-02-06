/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_06;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Semea extends Aita {

	/** The dato. */
	private int dato;

	/**
	 * M.
	 */
	@Override
	public void m() {
		System.out.println("Seme klaseko metodoa");
		super.datua = 10;
		datua = 20;
	}

	/**
	 * Gets the datua.
	 *
	 * @return the datua
	 */
	public void getDatua() {
		System.out.println(super.datua);
	}

	/**
	 * Erakutsi.
	 */
	public void erakutsi() {
		this.m();
		m();
		super.m();
	}

}