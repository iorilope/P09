/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_06;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Test {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Semea h = new Semea();
		h.erakutsi();

		// erakutsi egiterakoan bi aldis seme klasea metodo erakutsiko du baina
		// azkenekoa
		// super.m() denez aita klaseko metodoa deitzen da
		h.getDatua();
		// erakutsiko duen datua semearena izango da, instantzia berria semearena baita
	}

}