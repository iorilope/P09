package p09_02;

public abstract class Forma
{
	public void identitatea() 
	{
		System.out.println(this);
	}

	public abstract String inprimatu();
}

public class Zirkulu extends Forma
{
	public String inprimatu() {
		return "Zirkulua";
	}
}

public class Karratu extends Forma
{
	public String inprimatu() {
		return "Karratua";
	}
}