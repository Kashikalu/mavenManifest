package eingabe;

import java.util.Scanner;

import listen.KoeffizientList;
import parameterDouble.*;
import parameterInt.FunktionsID;
import parameterInt.MaxExponent;


/**
 * @author Z1323A02
 * Klasse Zum Einlesen von Werten aus der Konsole
 */
public class WerteEinleser {

	private Scanner sc;
	
	/**
	 * Scanner wird zugewiesen
	 */
	public WerteEinleser() {
		sc = new Scanner(System.in);
	}
	
	

	/**
	 * @param WerteArt String der die Art des double wertes Bestimmt
	 * @return einer aus der Konsole eingegebener Double wert wird zurückgegeben
	 */
	private double konsoleneingabeDouble(String WerteArt) {
		System.out.println(WerteArt+":");
		double wert = sc.nextDouble();
		return wert;
	}
	
	/**
	 * @param WerteArt String der die Art des double wertes Bestimmt
	 * @return einer aus der Konsole eingegebener Int wert wird zurückgegeben
	 */
	private int konsoleneingabeInt(String WerteArt) {
		System.out.println(WerteArt+":");
		int wert = sc.nextInt();
		return wert;
	}
	
	/**
	 * @return Das Objekt XMin wird erzeugt mit einem Double wert der aus der Konsole eingelesen wird
	 */
	public XMin getXMin() {
		return new XMin(konsoleneingabeDouble("x Min"));
	}
	
	/**
	 * @return Das Objekt XMax wird erzeugt mit einem Double Wert der aus der Konsole eingelesen wird
	 */
	public XMax getXMax() {
		return new XMax(konsoleneingabeDouble("x Max"));
	}
	
	/**
	 * @return Das Objekt DeltaX wird erzeugt mit einem Double Wert der aus der Konsole eingelesen wird
	 */
	public DeltaX getDeltaX() {
		return new DeltaX(konsoleneingabeDouble("Delta x"));
	}
	
	/**
	 * @return Das Objekt MaxExponent wird erzeugt mit einem Int Wert der aus der Konsole eingelesen wird
	 */
	public MaxExponent getNGrad() {
		return new MaxExponent(konsoleneingabeInt("N Grad"));
	}
	

	/**
	 * @param maxExpo Objekt zur Bestimmung des Größtmöglichen Exponenten
	 * @return Eine Liste von Koeffizienten welche aus der Konsole Eingelesen wurden wird zurückgegeben
	 */
	public KoeffizientList getKoeffizientenList(MaxExponent maxExpo) {
		
		KoeffizientList kfList = new KoeffizientList();

		for(int i=0; i<maxExpo.getWert()+1; i++) {
			kfList.add(new Koeffizient(konsoleneingabeDouble("Koeffizient "+i)));
		}
		return kfList;
	}
	
	/**
	 * @return Das Objekt FunktionsID wird erzeugt mit einem Int Wert(1-3) der aus der Konsole eingelesen wird
	 */
	public FunktionsID getFunktionID() {
		return new FunktionsID(konsoleneingabeInt("Funktion (1-3)"));
	}
	
}
