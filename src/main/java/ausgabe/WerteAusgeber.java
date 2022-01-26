package ausgabe;

import koordinatenSystem.Punkt;
import listen.KoordinatenList;
import listen.LoesungenList;

/**
 * @author Z1323A02
 * Klasse zum Ausgeben von Daten auf die Konsole
 * 
 * 
 */

public class WerteAusgeber {
	
	public WerteAusgeber() {}
	
	
	/**
	 * @param koList Liste von Koordinaten(Punkten)
	 * 
	 * gibt mit hilfe von einer While-Schleife alle Punkte aus der Koordinatenliste auf der Konsole aus
	 */
	public void wertetabelleAusgebenKonsole(KoordinatenList koList) {
		Punkt currentPunkt = koList.getNextPunkt();
		
		while(currentPunkt != null) {
			System.out.println("x: "+currentPunkt.getXkoordinate()+"\ty: "+currentPunkt.getYkoordinate());
			currentPunkt = koList.getNextPunkt();
		}
	}
	
	/**
	 * @param l Liste von Nullpunkten einer Quadratischen funktion
	 * 
	 * gibt die Anzahl aller Nullstellen auf der Konsole aus
	 * gibt die einelnen Nulltellen (x Koordinaten) auf der Konsole aus
	 */
	public void loesungsmaengeQuadratischeFunktionenAusgabeKonsole(LoesungenList l) {
		System.out.println("Es liegen "+l.getLaenge()+" vor.");
		
		for(int i=0; i<l.getLaenge(); i++) {
			System.out.println(l.getNextLoesung());
		}
	}
}
