/*
 * 2024(e)ko ots. 6(a)
 * Ioritz Lopetegi
 */
package p09_07;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class TestFigurak {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Karratua k = new Karratua(5);

		// Karratua ordez irudia jarriko bagenu gure programak ez luke funtzionatuko
		// irudiak ez baitu eraikitzailerik eta hierarkia ez da errespetzatzen

		k.setKolorea("Berdea"); // Figura klasearen metodoaren deiak
		System.out.println(k.getKolorea());
		System.out.println(k.getAzalera());//

		// Lehenik karratuaren kolorea eta azalera ikusiko dugu

		Karratua i = new Karratua(6);

		// Ordea irudia karratu bihurtzen badugu programa erabil dezakegu hierarkia
		// errespetazen baitugu
		if (i instanceof Irudia == true) {
			System.out.println("i Irudia motako objektu bat da");
			if (i instanceof Karratua == true)
				System.out.println("eta i karratua da");
			else
				System.out.println("baina i ez da karratu bat");

		}

		if (k instanceof Irudia == true) {
			System.out.println("k Irudia motako objektu bat da");
			if (k instanceof Karratua == true)
				System.out.println("eta k karratua da");
			else
				System.out.println("baina k ez da karratu bat");

		}
		// Aterako den emaitza i irudia dela eta k karratua dela esanez

	}

}