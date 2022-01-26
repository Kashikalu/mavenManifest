package graphGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author z1323a02
 * Klasse zum Erzeugen eines GUIS auf dem der Graph gezeichnet wird
 */
abstract class GUI {
	
	protected int width, height;
	protected JFrame frame;
	protected JPanel panel;
	
	public GUI() {}
	
	/**
	 * Fenster wird erzeugt und ein Jlabel wird hinzugefügt
	 */
	protected void gUIErstellen() {
		width = 600;
		height = 600;
	
		frame = new JFrame("Graphen Plotter");  
		panel = new JPanel();
		
		frame.setSize(700, 700);
		frame.add(panel);
		frame.setVisible(true);
	}

	/**
	 * @return Methode gibt die Länge des Fensters zurück
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * @return Methode gibt die Breite des Fensters zurück
	 */
	public int getWidth() {
		return width;
	}
}
