package listen;

import parameterDouble.Koeffizient;

public class KoeffizientList extends ListePrototyp{

	public KoeffizientList() {
		super();
	}
	
	/**
	 * @return gibt das nächste Objekt aus der liste als Koeffizient zurück
	 */
	public Koeffizient getNextLoesung() {
		Object pObj = getNextObject();
		return (Koeffizient) pObj;
	}
	
	
}
