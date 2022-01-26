package listen;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author z1323a02
 * Klasse zum Erstellen von Listen und grudlegende Funktionen für Listen
 */
public abstract class ListePrototyp {
	
	protected ArrayList<Object> list;
	protected ListIterator<Object> itList;
	protected int anzahl;
	
	/**
	 * Erzeugen einer Liste vom Datentyp Object(klasse aus der jede Klasse Erbt)
	 */
	public ListePrototyp() {
		 list = new ArrayList<Object>();
		 itList = list.listIterator();
		 
		 anzahl=0;
	}
	
	/**
	 * @param obj gibt das Objekt an welches in der Liste eingefügt werden soll
	 * 
	 * Funktion zum anfügen eines weiteren objektes und der bestimmung der länge der liste
	 */
	public void add(Object obj) {
		itList.add(obj);
		anzahl++;
	}
	
	/**
	 * @return Gibt das Nächste Objekt der Liste zurück und geht mit dem pointer 1 weiter
	 */
	protected Object getNextObject() {
		try{
			return itList.next();
		}catch (Exception e) {
			return null;
		}
			}
	
	/**
	 * Funktion zum ermitteln des ersten Objektes in einer Liste
	 */
	public void moveToFirst() {
		while(itList.hasPrevious()) {
			itList.previous();
		}
	}
	
	/**
	 * @return gibt die Länge der Liste zurück
	 */
	public int getLaenge() {
		return anzahl;
	}
	
	
}
