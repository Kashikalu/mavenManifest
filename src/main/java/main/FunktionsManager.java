package main;

import Wertetabelle.WertetabelleBerechner;
import ausgabe.WerteAusgeber;
import eingabe.WerteEinleser;
import funktion.Funktionseigenschaften;
import funktion.PQFormelLoeser;
import parameterDouble.*;
import parameterInt.FunktionsID;
import parameterInt.MaxExponent;


/**
 * @author z1323a02
 *
 * Klasse  zum Arbeiten mit funktionen und Funktionstabellen
 */
public class FunktionsManager {
	
	private WertetabelleBerechner wtBerechner;
	private WerteEinleser wtEinlesen;
	private PQFormelLoeser pqLoeser;
	private WerteAusgeber wtAusgeben;
	
	public FunktionsManager() {
		wtBerechner = new WertetabelleBerechner();
		wtEinlesen = new WerteEinleser();
		pqLoeser = new PQFormelLoeser();
		wtAusgeben = new WerteAusgeber();
	}
	
	private Funktionseigenschaften createPolynomfunktion(MaxExponent mxExpo, FunktionsID fID) {
		return (new Funktionseigenschaften(wtEinlesen.getDeltaX(), wtEinlesen.getXMax(), wtEinlesen.getXMin(), fID, wtEinlesen.getKoeffizientenList(mxExpo)));
	}
	
	public void wertetabelleFesteFunktionFesteWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenFesteFunktion(createPolynomfunktion(null, new FunktionsID(2))));
	}
	
	public void wertetabelleFesteFunktionVariableWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenFesteFunktion(createPolynomfunktion(null, new FunktionsID(2))));
		
	}
	
	public void wertetabelleVariableFunktionVariableWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenFesteFunktion(createPolynomfunktion(null, wtEinlesen.getFunktionID())));
	}
	
	public void wertetabellePolynomFunktion2GradVaraibleWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenpolynomfunktion(createPolynomfunktion(new MaxExponent(2),null)));
	}
	
	public void wertetabellePolynomFunktion4GradVaraibleWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenpolynomfunktion(createPolynomfunktion(new MaxExponent(4),null)));
	}
	
	public void wertetabellePolynomFunktionNGradVaraibleWerte() {
		wtAusgeben.wertetabelleAusgebenKonsole(wtBerechner.werteXYBerechnenpolynomfunktion(createPolynomfunktion(wtEinlesen.getNGrad(),null)));
	}
	
	public void loesenQuadratischeFunktionen() {
		wtAusgeben.loesungsmaengeQuadratischeFunktionenAusgabeKonsole(pqLoeser.pQFormelLoesen(wtEinlesen.getKoeffizientenList(new MaxExponent(2))));
	}
}
