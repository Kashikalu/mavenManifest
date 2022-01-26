package listen;

import parameterDouble.LoesungPQFormel;

/**
* Hier fehlt mir ein Kommentar
* ...
*/

public class LoesungenList extends ListePrototyp {
	
	public LoesungenList() {
		super();
	}
	
	/**
	 * @return gibt das nächste Objekt aus der Liste als LoesungPQFormel zurück
	 */
	public LoesungPQFormel getNextLoesung() {
		return (LoesungPQFormel) getNextObject();
	}
	
}
