package koordinatenSystem;

/**
 * Repräsentiert einen Punkt im Koordinatensystem
 * @author Z133111
 *
 */
public class Punkt {
	
	private XKoordinate xKoordinate;
	private YKoordinate yKoordinate;
	
	/**
	 * @param xKo beschreibt die x koordinate des Punktes
	 * @param yKo beschreibt die y koordinate des Punktes
	 */
	public Punkt(XKoordinate xKo, YKoordinate yKo) {
		this.xKoordinate = xKo;
		this.yKoordinate = yKo;
	}
	
	/**
	 * @return gibt die x Koordinate des Punktes als double zurück
	 */
	public double getXkoordinate() {
		return this.xKoordinate.getWert();
	}
	
	/**
	 * @return gibt die x Koordinate des Punktes als double zurück
	 */
	public double getYkoordinate() {
		return this.yKoordinate.getWert();
	}
}
