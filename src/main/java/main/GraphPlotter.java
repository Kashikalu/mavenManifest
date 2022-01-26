package main;

import java.io.File;
import org.knowm.xchart.*;
import Wertetabelle.WertetabelleBerechner;
import eingabe.WerteEinleser;
import exporter.GraphSpeichererPNG;
import exporter.ImageToPDFConverter;
import funktion.Funktionseigenschaften;
import graphBerechnen.PunkteBerechner;
import graphBerechnen.Skalierer;
import graphGUI.GraphZeichner;
import graphGUI.GraphZeichnerMitLib;
import koordinatenSystem.Punkt;
import listen.KoordinatenList;

/**
 * @author z1323a02
 *
 *Funktion um einen Graphen zu Plotten 
 */
public class GraphPlotter {
	
	private GraphZeichner gpZ;
	
	public GraphPlotter() {
	}
	
	/**
	 * @return gibt eine Liste mit Punkten einer Funktion zurück
	 * 
	 * Funktion zum berechnen einer vom Benutzer defenierten Polynomfunktion
	 */
	private KoordinatenList getXYKoordinaten() {
		
		WerteEinleser wtEinlesen = new WerteEinleser();
		WertetabelleBerechner wtBerechner = new WertetabelleBerechner();
		
		return wtBerechner.werteXYBerechnenpolynomfunktion(new Funktionseigenschaften(wtEinlesen.getDeltaX(), wtEinlesen.getXMax(), wtEinlesen.getXMin(), null, wtEinlesen.getKoeffizientenList(wtEinlesen.getNGrad())));
	}
	
	/**
	 * @param koList Liste mit Punkten eier Funktion
	 * @return gibt den erzeugten PunkteBerechner für das GUI zurück um die Koordinaten der Punkte auf das GUI anzupassen
	 */
	private PunkteBerechner getPunkteBerechner(KoordinatenList koList) {
		
		Skalierer sk = new Skalierer();
		
		int schrittX = sk.schrittGroesseX(koList.last().getXkoordinate(), koList.first().getXkoordinate(), gpZ.getWidth());
		int schrittY = sk.schrittGroesseY(koList.hochpunkt().getYkoordinate(), koList.tiefpunkt().getYkoordinate(), gpZ.getHeight());
		
		System.out.println("schritt X: "+schrittX+" schritt Y: "+schrittY);
		
		return new PunkteBerechner(schrittX, schrittY, koList.last().getXkoordinate(), koList.hochpunkt().getYkoordinate());
	}
	
	/**
	 * Graph wird Geplottet indem Punkte einer vom Benutzer bestimmten Funktion berechnet werden und diese dann auf das GUI angepasst und drauf gezeichnet werden und daraufhin die einzelnen Punkte chronologisch von xMin bis xMax verbunden werden
	 */
	public void plotten() {
		gpZ = new GraphZeichner();
		
		KoordinatenList koList = getXYKoordinaten();
		PunkteBerechner prB = getPunkteBerechner(koList);
		
		koList.moveToFirst();
		
		Punkt punktOld = null;
		
		for(int i=0; i<koList.getLaenge(); i++) {
			Punkt p = koList.getNextPunkt();
			
			int x = prB.xPosImGUI(p.getXkoordinate());
			int y = prB.yPosImGUI(p.getYkoordinate());
			
			System.out.println("x: "+x+" y: "+y);
			
			gpZ.punktZeichnen(x, y);
			
			if(punktOld != null) {
				gpZ.punkteVerbinden(x, y, prB.xPosImGUI(punktOld.getXkoordinate()), prB.yPosImGUI(punktOld.getYkoordinate()));
			}
			
			punktOld = p;
		}
	}
	
	/**
	 * Graph wird Geplottet indem Punkte einer vom Benutzer bestimmten Funktion berechnet werden und diese dann mit einer Lib auf ein GUI gezeichnet werden
	 * Der auf dem GUI gezeichnete Graph wird als PNG und als PDF exportiert und befindet sich dann in einem unterordner des Projektordners 
	 */
	public void plottenSpeichernMitLib() {
		KoordinatenList koList = getXYKoordinaten();

		koList.moveToFirst();
		int laenge = koList.getLaenge();
		
		double xKoordinaten[] = new double[laenge];
		double yKoordinaten[] = new double[laenge];
		
		for(int i=0; i<laenge; i++) {
			Punkt p = koList.getNextPunkt();
			xKoordinaten[i] = p.getXkoordinate();
			yKoordinaten[i] = p.getYkoordinate();
		}
		
		GraphZeichnerMitLib gpZmL = new GraphZeichnerMitLib();
		XYChart chart = gpZmL.graphZeichnenMitLib(xKoordinaten, yKoordinaten);
		
		GraphSpeichererPNG gSpeicherer = new GraphSpeichererPNG();
		File pngFile = gSpeicherer.graphSpeichern(chart);
		
		ImageToPDFConverter imgConverter = new ImageToPDFConverter();
		imgConverter.ConvertImageToPDF(pngFile);
		
		
		
	}
}
