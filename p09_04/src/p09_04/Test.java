/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_04;

/**
 * The Class Test.
 */
public class Test {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Langilea p1 = new Langilea();
		p1.setIzena("Atharratze Etchegaray");
		p1.setSoldataOinarria(1000);
		System.out.println(p1.getIzena() + p1.getSoldata());

		// kasu honetan getsoldata langiletik egiten du

		Arduraduna p2 = new Arduraduna();
		p2.setIzena("Miarritze Otsozelaia");
		p2.setSoldataOinarria(1000);
		p2.setPostua("Arduraduna");
		System.out.println(p2.getIzena() + " ren soldata " + p2.getSoldata() + " eta postua " + p2.getpostua());

		// kasu honetan getsoldata arduradunetik egiten du
	}
}