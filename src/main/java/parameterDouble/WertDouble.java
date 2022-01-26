package parameterDouble;


/**
 * @author Z1323A02
 * Klasse zum Erstellen von Objekten mit einem Double Wert
 */
public abstract class WertDouble {
	
	protected double wert;
	
	public WertDouble(double wert) {
		this.wert = wert;
	}
	
	/**
	 * @return gibt den Wert des Objektes als double zur�ck
	 */
	public double getWert() {
		return wert;	
	}
}
