package Vererbung;

import java.util.List;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		List<Kunde> lstKunde = new ArrayList<>();
		
;		Gesch�ftskunde Kunde1 = new Gesch�ftskunde("A","B","C","D","E","F","G");
		Privatkunde Kunde2 = new Privatkunde("A","B","C","D","E","F");
		Kunde Kunde3 = new Kunde("A","B","C");
		
		System.out.println(Kunde1.getOrt());
		
	}
}