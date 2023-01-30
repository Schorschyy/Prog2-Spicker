package Vererbung;

public class Geschäftskunde extends Kunde{

	
	
	private String ansprechpartnerVorname;
	private String ansprechpartnerNachname;
	private String unternehmen;
	private String abteilung;

	public Geschäftskunde(String adresse, String ort, String kundennummer, String ansprechpartnerVorname, String ansprechpartnerNachname, String unternehmen, String abteilung) {
		super (adresse, ort, kundennummer);
		this.ansprechpartnerVorname = ansprechpartnerVorname;
		this.ansprechpartnerNachname = ansprechpartnerNachname;
		this.unternehmen = unternehmen;
		this.abteilung = abteilung;
		
	}

	public String getUnternehmen() {
		return this.unternehmen;
	}

	public void setUnternehmen(String newUnternehmen) {
		this.unternehmen = newUnternehmen;
	}

	public String getOrt() {
		return  this.ort;
	}
	
	public void setOrt(String newOrt) {
		this.ort = newOrt;
	}
	
	public String getAdresse() {
		return  this.adresse;
	}
	
	public void setAdresse(String newAdresse) {
		this.adresse = newAdresse;
	}
	
	public void setkundennummer(String newOrt) {
		this.ort = newOrt;
	}
	
	public String getkundennummer() {
		return  this.kundennummer;
	}
}
