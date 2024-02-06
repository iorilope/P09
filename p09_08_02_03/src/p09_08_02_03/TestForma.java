/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_08_02_03;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class TestForma {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Forma f = new Zirkulua();
		f.id();

		Forma c = new Zirkulua();
		(c).id();
		((Zirkulua) f).id();

		Forma f2 = new Karratua();
		// f2.SetId(2);
		f2.id();

		(f).id();

		f = c;
		c = f;

		// programak 0 da bere id-a esango du id-ak ez baitu balorerik, set id egiten
		// badugu balorea aldatuko da
	}
}