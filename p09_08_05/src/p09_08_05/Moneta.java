/**
 * 
 */
package p09_08_05;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Moneta extends Zozketa {

	@Override
	public int jaurti() {
		
		return (int) (Math.random() * aukerak + 1);
	}
	
	public Moneta() {

		aukerak = 2;

	}

}
