package funktion;

import parameterDouble.WertDouble;

public class Ergebnis extends WertDouble {
	public Ergebnis(double wert) {
		super(wert);
	}
	
	/**
	 * @param wert Ein Wert der zum Wert des alten Ergebnis draufaddiert wird
	 */
	public void add(double wert) {
		this.wert += wert;
	}
}
