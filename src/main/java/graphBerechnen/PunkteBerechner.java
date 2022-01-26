package graphBerechnen;

/**
 * @author Z1323A02
 * Klasse zum zum Berechnen der Koordinaten von Punkten im GUI
 */
public class PunkteBerechner {
	
	private int schrittGroesseY, schrittGroesseX;
	private double xMax, yMax;
	
	/**
	 * @param schrittGroesseX Beschreibt die Schrittgtöße der X-Achse in pixel
	 * @param schrittGroesseY Beschreibt die Schrittgröße der Y-Achse in pixel
	 * @param xMax Beschreibt den maximalen X Wert im Wertebereich
	 * @param yMax Beschreibt den maximalen Y Wert im Wertebereich
	 */
	public PunkteBerechner(int schrittGroesseX, int schrittGroesseY, double xMax, double yMax) {
		this.schrittGroesseY = schrittGroesseY;
		this.schrittGroesseX = schrittGroesseX;
		this.xMax = xMax;
		this.yMax = yMax;
	}
	
	/**
	 * @param yWert Beschreibt die Y Koordinate eines Punktes
	 * @return gibt die zugehörige Y Koordinate des Punktes im Gui Zurück
	 */
	public int yPosImGUI(double yWert) {	
		return (int) ((yMax-yWert)*schrittGroesseY);
	}
	
	/**
	 * @param xWert Beschreibt die X Koordinate eines Punktes
	 * @return gibt die zugehörige X Koordinate des Punktes im Gui Zurück
	 */
	public int xPosImGUI(double xWert) {
		return (int) ((xMax-xWert)*schrittGroesseX);
	}
	
	
}
