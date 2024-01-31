/**
 * 
 */
package p09_07;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Karratua extends Irudia
{
	private int aldea;

	Karratua(int a)
	{
		this.aldea = a;
	}

	public int getAzalera() {
		return aldea * aldea;
	}
}