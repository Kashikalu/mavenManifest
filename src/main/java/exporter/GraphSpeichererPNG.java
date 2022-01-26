package exporter;

import java.io.File;
import java.io.IOException;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;

/**
 * @author z1323a02
 * Klasse um Geplotteten Graphen als PNG zu speichern
 */
public class GraphSpeichererPNG {
	
	/**
	 * @param chart Objekt welches alle informationen des Graphen beinhaltet
	 * @return wenn kein fehler auftritt wird die Datei in der der Geplottete Graph gespeichert ist zurück gegeben
	 * 
	 * Methode zeichnet den Graphen in eine PNG Datei ein
	 */
	public File graphSpeichern(XYChart chart) {
		try {			
			String currPath = System.getProperty("user.dir");
			
			
			String trennzeichen = File.separator;
			
			File file = new File(currPath+trennzeichen+"GraphDateien");
			
			if(!file.exists()) {
				file.mkdir();
			}
			
			BitmapEncoder.saveBitmap(chart, currPath+trennzeichen+"GraphDateien"+trennzeichen+"Graph", BitmapFormat.PNG);
			
			return new File(currPath+trennzeichen+"GraphDateien"+trennzeichen+"Graph.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
