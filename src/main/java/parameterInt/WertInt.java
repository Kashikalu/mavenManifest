package parameterInt;

/**
 * @author Z1323A02
 * Klasse zum Erstellen von Objekten mit einem Int Wert
 */
public abstract class WertInt {
	
	protected int wert;
	
	public WertInt(int wert) {
		this.wert = wert;
	}

	/**
	 * @return gibt den Wert des Objektes als int zurück
	 */
	public int getWert() {
		return wert;
	}
}
