package listen;

import koordinatenSystem.Punkt;

public class KoordinatenList extends ListePrototyp{
	
	public KoordinatenList() {
		super();
	}
	
	
	/**
	 * @return Gibt das Nächste Objekt aus der Liste als Punkt zurück
	 */
	private Punkt castToPunkt() {
		return (Punkt) getNextObject();
	}
	
	/**
	 * @return Gibt den nächsten Punkt aus der LIste zurück
	 */
	public Punkt getNextPunkt() {
		return castToPunkt();
	}
	
	/**
	 * @return gibt den letzten Punkt aus der Liste zurück
	 */
	public Punkt last() {
		moveToFirst();
		Punkt p = null;
		for(int i=0; i<getLaenge();i++) {
			p = getNextPunkt();
		}
		return p;
	}
	
	/**
	 * @return gibt das erste Element aus der Liste als Punkt zurück
	 */
	public Punkt first() {
		moveToFirst();
		return getNextPunkt();
	}
	
	/**
	 * @return gibt den Punkt aus der Liste zurück mit der kleinsten Y Koordinate
	 * vergleicht die Y Koordinaten der Punkte in der Liste und gibt den Punkt mit der kleinsten y Koordinate zurück
	 */
	public Punkt tiefpunkt() {
		moveToFirst();
		
		Punkt punktTip = castToPunkt();

		while(itList.hasNext()) {
			Punkt pufferPunkt = castToPunkt();
			
			if(punktTip.getYkoordinate() > pufferPunkt.getYkoordinate()) {
				punktTip = pufferPunkt;
			}
		}
		System.out.println("tiefpunkt x: "+ punktTip.getXkoordinate()+" y: "+ punktTip.getYkoordinate()+" "+punktTip);
		moveToFirst();
		
		return punktTip;
	}
	
	/**
	 * @return gibt den Punkt aus der Liste zurück mit der größten Y Koordinate
	 * vergleicht die Y Koordinaten der Punkte in der Liste und gibt den Punkt mit der größten y Koordinate zurück
	 */
	public Punkt hochpunkt() {
		moveToFirst();
		
		Punkt punktHop = castToPunkt();
		
		while(itList.hasNext()) {
			Punkt pufferPunkt = castToPunkt();
			
			if(punktHop.getYkoordinate() < pufferPunkt.getYkoordinate()) {
				punktHop = pufferPunkt;
			}
		}
		
		System.out.println("hochpunkt x: "+ punktHop.getXkoordinate()+" y: "+ punktHop.getYkoordinate()+" "+punktHop);
		
		moveToFirst();
		
		return punktHop;
	}
}
