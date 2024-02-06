package p09_02;

public class TestForma {
	public static void main(String args[]) {
		String forma1, forma2;
		// Forma f0 = new Forma(); Errorea: klase abstraktuak ezin dira instantziatu

		Forma f1 = new Zirkulu();
		f1.identitatea();

		Forma f2 = new Karratu();
		f2.identitatea();

		forma1 = f1.inprimatu();
		forma2 = f2.inprimatu();

		System.out.println("1. forma " + forma1 + " da eta 2. forma " + forma2);
	}
}