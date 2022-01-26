package Wertetabelle;

import funktion.FunktionsWerteRechner;
import funktion.Funktionseigenschaften;
import koordinatenSystem.Punkt;
import koordinatenSystem.XKoordinate;
import koordinatenSystem.YKoordinate;
import listen.KoordinatenList;

/**
 * @author z1323a02
 * Klasse um eine Wertetabelle einer Funktion in einem Intervall zu berechnen
 */
public class WertetabelleBerechner {
	private FunktionsWerteRechner fn;
	
	public WertetabelleBerechner() {
		fn = new FunktionsWerteRechner();
	}
	
	/**
	 * @param funktionsEig Objekt zur bestimmung der Funktion und weitere eigenschaften wie der schrittgröße und des Interfalls
	 * @return gibt eine Liste von Punkten mit den Berechneten Funktionswerten zurück
	 * Methode zum Berechnen einer Wertetabelle einer Festen Funktion
	 */
	public KoordinatenList werteXYBerechnenFesteFunktion(Funktionseigenschaften funktionsEig) {
		
		KoordinatenList koordinatenList = new KoordinatenList();
		
		for (double i = funktionsEig.getXMin(); i<funktionsEig.getXMax(); i+=funktionsEig.getDeltaX()) {
			
			koordinatenList.add(new Punkt(new XKoordinate(i), new YKoordinate(fn.festeFunktionBerechnen(funktionsEig).getWert())));
			
			funktionsEig.setCurrentX();
		}
		
		return koordinatenList;
	}
	
	
	/**
	 * @param funktionsEig Objekt zur bestimmung der Funktion und weitere eigenschaften wie der schrittgröße und des Interfalls
	 * @return gibt eine Liste von Punkten mit den Berechneten Funktionswerten zurück
	 * Methode zum Berechnen einer Wertetabelle einer Polynomfunktion
	 */
	public KoordinatenList werteXYBerechnenpolynomfunktion(Funktionseigenschaften funktionsEig) {
		
		KoordinatenList koordinatenList = new KoordinatenList();
		
		for (double i = funktionsEig.getXMin(); i<=funktionsEig.getXMax(); i+=funktionsEig.getDeltaX()) {
			
			Punkt p = new Punkt(new XKoordinate(i), new YKoordinate(fn.polynomfunktionBerechnen(funktionsEig).getWert()));
			System.out.println("x: "+p.getXkoordinate()+" y: "+p.getYkoordinate());
			koordinatenList.add(p);
			
			funktionsEig.setCurrentX();
		}
		
		return koordinatenList;
	}
}
