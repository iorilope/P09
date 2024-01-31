/**
 * 
 */
package p09_06;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Semea extends Aita {

	private int dato;

	@Override
	public void m() {
		System.out.println("Seme klaseko metodoa");
		super.datua = 10;
		datua = 20;
	}

	public void getDatua() {
		System.out.println(super.datua);
	}

	public void erakutsi() {
		this.m();
		m();
		super.m();
	}

}