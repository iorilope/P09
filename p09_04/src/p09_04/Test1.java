package p09_04;

public class Test1 {
	public static void main(String[] args) {
		// 1. langilea;
		Pertsona p1 = new Langilea();
		p1.setIzena("Atharratze Etchegaray");
		((Langilea) p1).setSoldataOinarria(1000);// akatsa konpilatzean
		System.out.println("Atharratzeren soldata da:" + ((Langilea) p1).getSoldata());// errorea konpilatzean

		// 2. langilea;
		Langilea p2 = new Arduraduna();
		p2.setIzena("Miarritze Otsozelaia");
		p2.setSoldataOinarria(1000);
		((Arduraduna) p2).setPostua("Biltegiko burua");// errorea konpilatzean
		System.out.println("Miarritzeren soldata da:" + p2.getSoldata());

	}
}