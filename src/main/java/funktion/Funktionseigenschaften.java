package funktion;

import listen.KoeffizientList;
import parameterDouble.DeltaX;
import parameterDouble.XMax;
import parameterDouble.XMin;
import parameterInt.FunktionsID;

/**
 * @author Z1323A02
 * Klasse um eine Funktion zu beschreiben
 */
public class Funktionseigenschaften {
	
	private DeltaX dx;
	private XMax xMax;
	private XMin xMin;
	private FunktionsID fID;
	private KoeffizientList koList;
	private double currX;
	
	/**
	 * @param dx Objekt das die Schrittweite zwischen xMin und xMax um Funktionswerte zu berechnen
	 * @param xMax Objekt das die größte X Position beschreibt in der Funktionswerte berechnet werden können
	 * @param xMin Objekt das die kleinste X Position beschreibt in der Funktionswerte berechnet werden können
	 * @param fID Objekt welches die Art der Funktion beschreibt. Falls Null handelt es sich um eine Polynomfunktion
	 * @param koList Liste von Koeffizienten. Falls null handelt es sich um keine Polynomfunktion
	 * @param currX Beschreibt einen X wert zwischen xMin und xMax um Funktionswerte zu berechnen
	 */
	public Funktionseigenschaften(DeltaX dx, XMax xMax, XMin xMin, FunktionsID fID, KoeffizientList koList) {
		this.dx = dx;
		this.xMax = xMax;
		this.xMin = xMin;
		this.fID = fID;
		this.koList = koList;
		currX = xMin.getWert();
	}
	
	/**
	 * @return gibt den X Wert zwischen xMin und xMax zurück
	 */
	public double getCurrentX() {
		return currX;
	}
	
	
	/**
	 * Funktion zum berechnen des X Wertes
	 */
	public void setCurrentX() {
		currX += dx.getWert();
	}
	
	/**
	 * @return gibt die Schritgröße von currX zurück
	 */
	public double getDeltaX() {
		return dx.getWert();
	}
	
	/**
	 * @return gibt den maximalen Wert den currX annehmen kann zurück
	 */
	public double getXMax() {
		return xMax.getWert();
	}
	
	/**
	 * @return gibt den minimalen Wert den currX annehmen kann zuück
	 */
	public double getXMin() {
		return xMin.getWert();
	}
	
	/**
	 * @return gibt eine Liste von Koeffizienten zurück um Funktionswerte einer Polynomfunktion zu berechnen. Wenn keine Polynomfunktion wird Null zurückgegeben
	 */
	public KoeffizientList getKoeffizientenList() {
		return koList;
	}
	
	
	/**
	 * @return gibt die Art der Funktion zurück. Wenn Polynomfunktion wird Null zurückgegeben
	 */
	public int getFunktionsID() {
		return fID.getWert();
	}
}
