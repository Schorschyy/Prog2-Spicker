public abstract class abstrakte {
//oberklasse in der keine Objekte erstellt werden soll
//wenn es in eine Unterklasse implementiert werden soll
	protected String vorname;
	protected String nachname;
	
	protected abstrakte(String vorname, String nachname){ 
		this.vorname=vorname;
		this.nachname=nachname;
		
	}
	public void dokDrucken() {
		System.out.println("___");
		printAusweis();
		
	}
	protected abstract void printAusweis(); //muss in Unterklasse implementiert sein
   //Beispiel hierzu wäre Fahrzeug 
	@Override //Überschreibt abstrakte methode
    protected void printAusweis() {
		System.out.println("Studierendenausweis:");
	}
}
