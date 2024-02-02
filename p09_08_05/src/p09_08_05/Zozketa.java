/**
 * 
 */
package p09_08_05;

/**
 * 
 * @author Ioritz Lopetegi
 */
public abstract class Zozketa {
	protected int aukerak ;
	protected int zenbakiak;

	public abstract int jaurti();
	

	@Override
    public String toString() {
        return "Dado{" +
                "Zenbakia=" + zenbakiak +
                '}';
    }
}
