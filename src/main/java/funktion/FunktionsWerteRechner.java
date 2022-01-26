package funktion;


/**
 * @author Z1323A02
 * Klasse zum Berechnen von Funktionswerten von Polynomfunktionen sowie anderen Funktionen
 */
public class FunktionsWerteRechner {
	public FunktionsWerteRechner() {
		
	}
	
	/**
	 * Die Funktion Berechnet den Funktionswerten der Funktion fID_wert an der Stelle x.
	 * Wenn keine Funktion vorhanden Ergebnis = null
	 * 
	 * @param x	die Stelle an dem man den Funktionswert berechnen soll
	 * @param fID_wert beschreibt die Art der Funktion
	 * @return Das Ergebnis wird zurückgegeben
	 */
	private Ergebnis funktionswertBerechnenFesteFunktion(double x, int fIDWert){
		
		switch(fIDWert) {
			case 1: return new Ergebnis((x+3)*(x+3)+2);
			case 2: return new Ergebnis(Math.sin(x)+3);
			case 3: return new Ergebnis(3+3*x);
		}
		
		return null;
		
	}
	
	/**
	 * Funktion um Funktionswerte einer vorgegebenen Funktion zu Berechnen
	 * @param funkEig Objekt zum Beschreiben der Funktion
	 * @return gibt den Funktionwerten an einer stelle x zurück
	 */
	public Ergebnis festeFunktionBerechnen(Funktionseigenschaften funkEig) {
		return funktionswertBerechnenFesteFunktion(funkEig.getCurrentX(), funkEig.getFunktionsID());
	}
	
	
	
	/**
	 * Funktion um Funktionswerte einer Polynomfunktion zu berechnen
	 * @param funkEig Objekt zum Beschreiben der Funktion
	 * @return gibt den Funktionwerten an einer stelle x zurück
	 */
	public Ergebnis polynomfunktionBerechnen(Funktionseigenschaften funkEig) {
		Ergebnis erg = new Ergebnis(0);
		int laenge = funkEig.getKoeffizientenList().getLaenge();
		
		funkEig.getKoeffizientenList().moveToFirst();
		
		for(int i=0; i< laenge; i++) {
			erg.add(Math.pow(funkEig.getCurrentX(),(laenge-(i+1)))*funkEig.getKoeffizientenList().getNextLoesung().getWert());
		}
		return erg;
	}
}
