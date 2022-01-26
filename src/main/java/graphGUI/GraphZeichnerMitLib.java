package graphGUI;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

/**
 * @author z1323a02
 *
 * Klasse zum erzeugen von Graphen mit hilfe von XChar(lib zum plotten von Graphen)
 */
public class GraphZeichnerMitLib {
	
	/**
	 * @param xKo array aus double Werten welche die einzuzeichnenden x Koordinaten sind
	 * @param yKo array aus double Werten welche die einzuzeichnenden y Koordinaten sind
	 * @return gibt das Objekt XYCHart zurück welches alle informationen des Graphen beinhaltet
	 * 
	 * Methode Plottet einen Graphen mit übergebenden X und Y koordinaten
	 */
	public XYChart graphZeichnenMitLib(double[] xKo, double[] yKo) {
		XYChart chart = QuickChart.getChart("Einfacher Graph", "X", "Y", "y(x)", xKo, yKo);
		
		new SwingWrapper(chart).displayChart();
		
		return chart;
	}	
}
