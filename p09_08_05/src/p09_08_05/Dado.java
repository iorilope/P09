/**
 * 
 */
package p09_08_05;

import java.lang.Math;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Dado extends Zozketa {

	public Dado() {

		aukerak = 6;

	}

	@Override
	public int jaurti() {

		return (int) (Math.random() * aukerak + 1);
	}

	
	
}