package p09_04;

public class Arduraduna extends Langilea {
	private String p;

	public int getSoldata() {
		Double d = Double.valueOf(soldataOinarria * 1.1);
		return d.intValue();
	}

	public void setPostua(String postua) {
		p = postua;
	}

	public String getpostua() {

		return p;
	}

}