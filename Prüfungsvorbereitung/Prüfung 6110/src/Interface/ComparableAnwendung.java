package Interface;
import java.util.ArrayList;
import java.util.List;
import java.util.*; 

public class ComparableAnwendung {

	public static void main(String args[]) {
		
		List<Gebaeude> gebaeudeliste = new ArrayList<Gebaeude>();
		
		gebaeudeliste.add(new Gebaeude(1, 15.0, "Betriebsgebaeude"));
		gebaeudeliste.add(new Gebaeude(2, 21.0, "Wohngebaeude"));
		gebaeudeliste.add(new Gebaeude(3, 18.0, "Verteilstation"));
		

		// Sortierung durchfuehren
		Collections.sort(gebaeudeliste);
		
		
		System.out.println("Gebaeude = "+ gebaeudeliste.toString());
		
	}	

}