package SpickerVererbung;

HASMAP
-stores items in key/value, access with index of another type
import java.util.HashMap; // import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();

ADD ITEMS
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    Map<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    //in einer Liste speichern
    List <String> capitalCities = new Arraylist();
    capiatlCities.addAll(capiatalCities.keySet);
    
    System.out.println(capitalCities);
  }
}
Ausgabe: https://www.youtube.com/watch?v=sNrT2hbilsk
Set<String> keySet=capitalCities.keySet();
for (String s: keySet){
  System.out.println("Das Land" + s + "hat die Hauptstadt" + capitalCities.get(s));
}

ACCESS AN ITEM
capitalCities.get("England");

CONTAINS AN ITEM
cars.contains("Mazda");

REMOVE AN ITEM
capitalCities.remove("England");

SIZE OF HASMAP
capitalCities.size();

LOOPING THROUGH HASMAP
for (String i : capitalCities.keySet()) { //alternativ for (String i : capitalCities.values()) {
  System.out.println(i);
}
  System.out.println(i);
}