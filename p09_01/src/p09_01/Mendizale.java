/**
 * 
 */
package p09_01;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Mendizale {
	
	private String izenaString = "";
	private int garaiera1 = 0;
	private int garaiera2 = 0;
	private int garaiera3 = 0;
	private double batazbestekoa = 0;
	
	
	
	/**
	 * 
	 */
	public Mendizale(String mndzIzenString,int mndzgaraiera1,int mndzgaraiera2,int mndzgaraiera3, double mndzBatazbestekoa) {
		
		izenaString = mndzIzenString;
		garaiera1 = mndzgaraiera1;
		garaiera2 = mndzgaraiera2;
		garaiera3 = mndzgaraiera3;
		batazbestekoa = mndzBatazbestekoa;
		
		
		
	}
	public Mendizale () {
		
		
		
	}



	/**
	 * @return the izenaString
	 */
	public String getIzenaString() {
		return izenaString;
	}



	/**
	 * @param izenaString the izenaString to set
	 */
	public void setIzenaString(String izenaString) {
		this.izenaString = izenaString;
	}



	/**
	 * @return the garaiera1
	 */
	public int getGaraiera1() {
		return garaiera1;
	}



	/**
	 * @param garaiera1 the garaiera1 to set
	 */
	public void setGaraiera1(int garaiera1) {
		this.garaiera1 = garaiera1;
	}



	/**
	 * @return the garaiera2
	 */
	public int getGaraiera2() {
		return garaiera2;
	}



	/**
	 * @param garaiera2 the garaiera2 to set
	 */
	public void setGaraiera2(int garaiera2) {
		this.garaiera2 = garaiera2;
	}



	/**
	 * @return the garaiera3
	 */
	public int getGaraiera3() {
		return garaiera3;
	}



	/**
	 * @param garaiera3 the garaiera3 to set
	 */
	public void setGaraiera3(int garaiera3) {
		this.garaiera3 = garaiera3;
	}



	/**
	 * @return the batazbestekoa
	 */
	public double getBatazbestekoa() {
		return batazbestekoa;
	}



	/**
	 * @param batazbestekoa the batazbestekoa to set
	 */
	public void setBatazbestekoa(double batazbestekoa) {
		this.batazbestekoa = batazbestekoa;
	}
	
	
	@Override
    public String toString() {
        return "Izena: " + izenaString + ", Garaiera1: " + garaiera1 + ", Garaiera2: " + garaiera2 +
               ", Garaiera3: " + garaiera3 + ", Batazbestekoa: " + batazbestekoa;
    }
	
	

}
