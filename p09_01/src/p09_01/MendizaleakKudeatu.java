/**
 * 
 */
package p09_01;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class MendizaleakKudeatu {

	/**
	 * 
	 */
	private static final String ERROREA_GERTATU_DA = "Errorea gertatu da: ";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Mendizale> mendizaleZerrendArrayList = new ArrayList<>();

		int aukera = 0;

		// Mendizale batzuk sartzen ditugu

		mendizaleZerrendArrayList.add((new Mendizale("Unai", 2000, 1600, 1500, 1700)));
		mendizaleZerrendArrayList.add((new Mendizale("Julen", 1000, 1800, 1700, 1500)));
		mendizaleZerrendArrayList.add((new Mendizale("Jon", 1345, 2100, 1500, 1648.33)));

		do {
			try {

				System.out.println("==================================================================");
				System.out.println("    Sartu zure aukera");
				System.out.println("    1-Mendizale Guztiak erakutsi");
				System.out.println("    2-Mendizalea Gehitu");
				System.out.println("    3-Mendizalea ezabatu");
				System.out.println("    4-Mendizaleen bataz bestekoa ikusi");
				System.out.println("    0-Irten");
				System.out.println("==================================================================");

				aukera = sc.nextInt();

				switch (aukera) {
				case 1:
					try {

						for (Mendizale mendizale : mendizaleZerrendArrayList) {
							System.out.println(mendizale.toString());
						}
					} catch (Exception e) {
						System.out.println(MendizaleakKudeatu.ERROREA_GERTATU_DA + e.getMessage());

					}

					break;

				case 2:

					try {
						System.out.println("Mendizalea gehitu aukeratu duzu");

						System.out.println("Zenbat mendizale sartu nahi dituzu");

						int kopurua = 0;

						try {
							kopurua = sc.nextInt();
						} catch (java.util.InputMismatchException e) {
							System.out.println("Sartu duzun balioa ez da zenbaki bat. Programa itxiko da.");
							System.exit(0);
						}

						for (int i = 0; i < kopurua; i++) {

							Mendizale mendizalea = new Mendizale();

							System.out.println("Sartu mendizalearen izena");

							sc.nextLine();
							String izenaString = sc.nextLine();

							mendizalea.setIzenaString(izenaString);

							System.out.println("Sartu lehen mendiaren garaiera");

							int garaieraa1 = sc.nextInt();
							mendizalea.setGaraiera1(garaieraa1);

							System.out.println("Sartu Bigarren mendiaren garaiera");

							int garaieraa2 = sc.nextInt();
							mendizalea.setGaraiera2(garaieraa2);

							System.out.println("Sartu azken mendiaren garaiera");

							int garaieraa3 = sc.nextInt();

							mendizalea.setGaraiera3(garaieraa3);

							double batazbestekoaa = ((garaieraa1 + garaieraa2 + garaieraa3) / 3);
							mendizalea.setBatazbestekoa(batazbestekoaa);

							mendizaleZerrendArrayList.add(mendizalea);

						}
					} catch (Exception e) {
						System.out.println(MendizaleakKudeatu.ERROREA_GERTATU_DA + e.getMessage());

					}

					break;
				case 3:
					try {

						System.out.println("Mendizalea kendu aukeratu duzu");
						int index = 1;
						for (Mendizale mendizalee : mendizaleZerrendArrayList) {
							System.out.println(index + ": " + mendizalee);
							index++;
						}

						System.out.print("Sartu kendu nahi duzun autoaren zenbakia : ");
						int aukera2 = 0;

						try {
							aukera2 = sc.nextInt();
						} catch (java.util.InputMismatchException e) {
							System.out.println("Errorea: Sartu duzun balioa ez da zenbaki bat.");
							sc.nextLine();
						}

						if (aukera2 > 0 && aukera2 <= mendizaleZerrendArrayList.size()) {
							mendizaleZerrendArrayList.remove(aukera2 - 1);
							System.out.println("Mendizalea ondo kendu da.");
							int index2 = 1;
							for (Mendizale mendizalee : mendizaleZerrendArrayList) {
								System.out.println(index2 + ": " + mendizalee);
								index2++;
							}
						} else {
							System.out.println("Gaizki aukeratu duzu. Ez da autorik kendu.");
						}
					} catch (Exception e) {
						System.out.println(MendizaleakKudeatu.ERROREA_GERTATU_DA + e.getMessage());

					}

					break;
				case 4:
					try {

						System.out.println("Batazbestekoa Ikusi aukeratu duzu");

						for (Mendizale mendizale : mendizaleZerrendArrayList) {
							System.out.println(mendizale.toString());
						}

					} catch (Exception e) {
						System.out.println(MendizaleakKudeatu.ERROREA_GERTATU_DA + e.getMessage());

					}

					break;
				case 0:
					System.out.println("Programatik ireteten Agur!");
					break;

				default:
					System.out.println("Auekra desegokia");

				}
			} catch (Exception e) {
				System.out.println(MendizaleakKudeatu.ERROREA_GERTATU_DA + e.getMessage());

			}
			

		} while (aukera != 0);
sc.close();
	}

}
