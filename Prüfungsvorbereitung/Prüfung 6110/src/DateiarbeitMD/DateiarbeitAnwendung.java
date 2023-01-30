package DateiarbeitMD;

import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class DateiarbeitAnwendung {
	public static void main(String[] args) {
		List<Datenbaustein> list = new ArrayList<>();
		list.add(new Datenbaustein(1, "Müller","Bezeichnung 1", 5.0));
		list.add(new Datenbaustein(2, "Lehmann","Bezeichnung 2", 3.0));
		list.add(new Datenbaustein(5, "Meier","Bezeichnung 5", 14.0));
		// hier soll die Implementierung des Schreibens
		// in eine Datei folgen
		
		//Datei anlegen
		File daten = new File ("C:\\Users\\panno\\eclipse\\datei.txt");
		//prüfen, ob Datei existiert
		if(daten.exists()) {
			System.out.println("Datei existiert");
		}else {
			System.out.println("Datei existiert nicht");
		}
		//andere Möglichkeit zu zeigen. ob Datei existiert
		System.out.println(daten.isFile());
		
		
		
	//Datei schreiben
	try {
        BufferedReader reader = new BufferedReader(new FileReader("daten.txt"));
        String line;
        	while((line = reader.readLine()) != null) {
        		StringTokenizer tokenizer = new StringTokenizer(line, ";");
        		int id = Integer.parseInt(tokenizer.nextToken());
        		String name = tokenizer.nextToken();
        		double wert = Double.parseDouble(tokenizer.nextToken());
        		String bezeichnung = tokenizer.nextToken();
        		list.add(new Datenbaustein(id, name,bezeichnung,wert));
        }
        	reader.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    }
	
	//Datei einlesen
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("daten.txt"));
            for (Datenbaustein obj : list) {
                String line = obj.getId() + ";" + obj.getName() + ";" + obj.getBezeichnung() + ";" + obj.getWert();
                StringTokenizer tokenizer = new StringTokenizer(line, ";");
                while (tokenizer.hasMoreTokens()) {
                    writer.write(tokenizer.nextToken());
                    writer.write(";");
                }
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}