package graphBerechnen;


/**
 * @author Z1323A02
 * Klasse zum Berechnen der X-Achse sowie Y-Achse
 */
public class Skalierer {
	public Skalierer() {}
	
	/**
	 * @param xMax Maximale X position des Graphen
	 * @param xMin minimale X position des Graphen
	 * @param widthGUI gr��e des Fensters des Auszugebenen Graphen
	 * @return gibt die schrittgt��e einer einheit in pixel zur�ck
	 */
	public int schrittGroesseX(double xMax, double xMin, int widthGUI) {
		double abstandX = xMax-xMin;
		return (int) (widthGUI/abstandX);
	}
	
	/**
	 * @param yMax Maximale X position des Graphen
	 * @param yMin minimale X position des Graphen
	 * @param heightGUI gr��e des Fensters des Auszugebenen Graphen
	 * @return gibt die schrittgt��e einer einheit in pixel zur�ck
	 */
	public int schrittGroesseY(double yMax, double yMin, int heightGUI) {
		double abstandY = yMax-yMin;
		return (int) (heightGUI/abstandY);
	}
}
