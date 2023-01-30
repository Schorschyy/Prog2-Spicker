import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class hauptfürhashmap { //eigentlich in Main
	//JEDER KEY MUSS EINZIGEARTIG SEIN
	public static void main(String[] args) {
		HashMap<Integer,String> plz= new HashMap<>();
		plz.put(1009, "Dresden");
		plz.put(70372, "Stuttgart");
		//Map<Boolean, int> map = Map.of();
		//map.put("true", 12);
		//(Key, Value)
		System.out.println(plz.get("Dresden"));
		System.out.println(plz.containsKey(1009)) //gibt an, ob existiert
		//plz.remove(70372);
		//plz.containsKey(70372); //gucken ob enthalten
		//plz.replace(1009, "Stutt"); /aendern
		
		System.out.println(plz.get(1009));
		
		//Alle werte ausgeben
		Set<Integer> keySet = plz.keySet();
		for (Integer s : keySet) {
			System.out.println("Die Stadt" + s + "hat die Postleitzahl" + plz.get(s) + ".");
		}
		
		//speichert in liste
		List<String> Staedte = new ArrayList<>();
		Staedte.addAll(plz.keySet));
		
		Random random = new Random(); //gibt ein zufallsstadt aus
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int index = random.nextInt(Staedte.size());
			String Stadt = Staedte.get(index);
			System.out.println("Was ist die PLZ von" +Staedte);
			if (scan.next().equals(plz.get(Staedte)))
				System.out.println("Richtig!");
		} else {
			System.out.println("Leider falsch");
		}
	}
}


//noch ne Arrayliste muss kein int dabei sein
{
	List <Integer> Zahlen = new ArrayList();
	Zahlen.add(2);
	Zahlen.add(Banana);
	
	//löschen einer Sache aus einer Liste
	//Zahlen.remove(2);
	
	
	//ist die 2 in der Liste enthalten?
	
//	System.out.println(); Zahlen.contains(2);
	
	//ausgeben der lsite
	
	for (int i: Zahlen) {
		System.out.println(i);
	}
}

//nur Array
	int[] Zahlen = new int[3];
	Zahlen[0] = 2;
	Zahlen[1] = 3;
	
	
	//Einkaufsliste in der ich dinge speichern möchet 
=======================================================================	
	public static void main(String[] args) {
		List<String> einkaufsliste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in); //einlesen
		
		while(true) {
			System.out.println("Brauchen wir noch etwas? j/n");
			String s = scanner.next();
			if (s.equals("j")) {
				System.out.println("Was brauchen wir noch?");
				String product = scanner.next();
				einkaufsliste.add(product);
			} else if (s.equals("n")){
				System.out.println("Hier ist die Einkaufsliste");
				for (String product : einkaufsliste) {
					System.out.println(product);
				}
				break;
			}
		}
	}