package SpickerVererbung;

public class Verschiedenes {
	public String toString() {
			return "Raederanzahl: " + anzahlRaeder+"Hersteller: "+hersteller+"Gewicht: "+gewicht;
		}
	
//Methode toString() in Oberklasse kann aufgerufen werden
	public String toString() {
		return super.toString() + ", Ganganzahl: "+anzahlGaenge+", Fahrradtyp: "+fahrradtyp+", RahmenNr: "+rahmenNr;
	}

	
//InstanceOf: Liefert true, falls die konkrete Unterklasse die Klasse Fahrrad ist, ansonsten false
	
	if(einFahrzeug instanceof Fahrrad) {	
		System.out.println("Variable einFahrzeug ist vom Typ Fahrrad");
		System.out.println(einFahrzeug);
	// ggf. weitere spezielle Logik für Fahrrad

	} else if(einFahrzeug instanceof Auto) {		
		System.out.println("Variable einFahrzeug ist vom Typ Auto");
		System.out.println(einFahrzeug);
	// ggf. weitere spezielle Logik für Auto
	}

// final: KLasse: -Verhindern der Vererbung
		  //Methode: -
}

