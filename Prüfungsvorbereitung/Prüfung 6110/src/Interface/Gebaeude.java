package Interface;

public class Gebaeude implements Comparable<Gebaeude>{
	public int nummer;
	public double hoehe;
	public String beschreibung;
	
	public Gebaeude(int nummer, double hoehe, String beschreibung) {
		this.nummer=nummer;
		this.hoehe=hoehe;
		this.beschreibung=beschreibung;
	}
	
	@Override
	public int compareTo(Gebaeude gebaeude) {
	if(this.hoehe==gebaeude.hoehe) {
	return 0;
	} else if(this.hoehe>gebaeude.hoehe) {
	return 1;
	} else {
	return -1;
	}
	}
	
	@Override
	public String toString() {
        return "[" + nummer+ ", " + hoehe +", "+ beschreibung + "]";
    }
	

}

