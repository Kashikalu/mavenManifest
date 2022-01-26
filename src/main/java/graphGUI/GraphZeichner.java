package graphGUI;

/**
 * @author Z1323A02
 * Funktion zum Zeichnen im GUI
 * 
 */
public class GraphZeichner extends GUI{
	
	
	/**
	 * GUI wird erzeugt
	 */
	public GraphZeichner() {
		super();
		gUIErstellen();
	}
	
	private final int punkteGroesse = 10;
	
	/**
	 * @param xPos Position x im GUI wo ein Punkt gezeichnet wird
	 * @param yPos Position y im GUI wo ein Punkt gezeichnet wird
	 * Funktion zeichnet Punkte in Form von Quadraten im GUI an der Stelle der �bergebenen Position
	 */
	public void punktZeichnen(int xPos, int yPos) {
		panel.getGraphics().drawRect((xPos-(punkteGroesse/2))+45, (yPos-(punkteGroesse/2))+45, punkteGroesse, punkteGroesse);
	}
	
	/**
	 * @param xPosP1 X Position des ersten Punktes
	 * @param yPosP1 Y Position des ersten Punktes
	 * @param xPosP2 X Position des zweiten Punktes
	 * @param yPosP2 Y Position des zweiten Punktes
	 * Funktion zum Verbinden von zwei Punkten
	 */
	public void punkteVerbinden(int xPosP1, int yPosP1, int xPosP2, int yPosP2) {
		panel.getGraphics().drawLine(xPosP1+45, yPosP1+45, xPosP2+45, yPosP2+45);
	}
}
