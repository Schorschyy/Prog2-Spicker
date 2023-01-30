package Dateiarbeit;

public class DatenClass {

	private int id;
	private String name;
	private double wert;
	private double val1;
	
	public DatenClass(int id, String name, double wert, double val1) {
		this.id=id;
		this.name=name;
		this.wert=wert;
		this.val1=val1;
	}

	
	public String toString() {
		return id + "; " + name + "; " + wert + ";" +val1 ;
	}
}
