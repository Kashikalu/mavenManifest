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
	 * @param xMax Objekt das die gr��te X Position beschreibt in der Funktionswerte berechnet werden k�nnen
	 * @param xMin Objekt das die kleinste X Position beschreibt in der Funktionswerte berechnet werden k�nnen
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
	 * @return gibt den X Wert zwischen xMin und xMax zur�ck
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
	 * @return gibt die Schritgr��e von currX zur�ck
	 */
	public double getDeltaX() {
		return dx.getWert();
	}
	
	/**
	 * @return gibt den maximalen Wert den currX annehmen kann zur�ck
	 */
	public double getXMax() {
		return xMax.getWert();
	}
	
	/**
	 * @return gibt den minimalen Wert den currX annehmen kann zu�ck
	 */
	public double getXMin() {
		return xMin.getWert();
	}
	
	/**
	 * @return gibt eine Liste von Koeffizienten zur�ck um Funktionswerte einer Polynomfunktion zu berechnen. Wenn keine Polynomfunktion wird Null zur�ckgegeben
	 */
	public KoeffizientList getKoeffizientenList() {
		return koList;
	}
	
	
	/**
	 * @return gibt die Art der Funktion zur�ck. Wenn Polynomfunktion wird Null zur�ckgegeben
	 */
	public int getFunktionsID() {
		return fID.getWert();
	}
}
