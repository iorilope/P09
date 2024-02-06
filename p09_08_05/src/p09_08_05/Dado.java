/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_08_05;

import java.lang.Math;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Dado extends Zozketa {

	/**
	 * Instantiates a new dado.
	 */
	public Dado() {

		aukerak = 6;

	}

	/**
	 * Jaurti.
	 *
	 * @return the int
	 */
	@Override
	public int jaurti() {

		return (int) (Math.random() * aukerak + 1);
	}

}