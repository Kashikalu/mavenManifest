package funktion;

import listen.KoeffizientList;
import listen.LoesungenList;
import parameterDouble.LoesungPQFormel;

/**
 * @author Z1323A02
 * Klasse zum Berechnen von Nullstellen einer Quadratischen Funktion
 */
public class PQFormelLoeser {
	public PQFormelLoeser() {
		
	}
	
	/**
	 * Funktion zum Berechnen von nullstellen mithilfe der PQ-Formel
	 * @param koList Liste von Koeffizienten 
	 * @return Eine Objekt vom Typ LoesungenList wird mit den berechneten l�sungen zur�ckgegeben. Falls keine L�sungen vorhanden wird eine Leere Liste zur�ck gegeben
	 */
	public LoesungenList pQFormelLoesen(KoeffizientList koList) {
		
		double loesung1, loesung2;
		
		LoesungenList loesungen = new LoesungenList();
		
		double a = koList.getNextLoesung().getWert();
		double p = koList.getNextLoesung().getWert()/a;
		double q = koList.getNextLoesung().getWert()/a;
		
		try {
			loesung1 = (-1*(p/2))+Math.sqrt(Math.pow((p/2), 2)-q);
			loesung2 = (-1*(p/2))-Math.sqrt(Math.pow((p/2), 2)-q);
			
			loesungen.add(new LoesungPQFormel(loesung1));
			
			if(loesung1 != loesung2) {
				loesungen.add(new LoesungPQFormel(loesung2));
			}
			
		}
		catch (Exception e){
		}
		
		return loesungen;
	}
}
