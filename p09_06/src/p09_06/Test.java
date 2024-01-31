/**
 * 
 */
package p09_06;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Test {

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