package Dateiarbeit;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class DateiarbeitAnwendung {
	
	public static void main(String[] args) {

		List<DatenClass> lst = new ArrayList<>();
		
		lst.add(new DatenClass(1, "Müller",3.4, 5.0));
		lst.add(new DatenClass(2, "Lehmann",8.1, 3.0));
		lst.add(new DatenClass(5, "Meier",1.4, 14.0));
	
		// hier soll die Implementierung des Schreibens
		// in eine Datei folgen
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:/Users/Georg/Downloads/testtext_03.txt");
			
			BufferedWriter bw = new BufferedWriter(fw);
			String eineZeile;
			
			for(int i = 0 ; i < lst.size(); i++) {
				eineZeile=lst.get(i).toString();
				bw.write(eineZeile);
				bw.newLine(); 
			}
				bw.close();
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
	
			
		List<String> lst2 = new ArrayList<>();
			
			File file = new File("C:/Users/Georg/Downloads/testtext_03.txt");

			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return;
			}

			String st;

			try {
				while ((st = br.readLine()) != null)
					
					lst2.add(st);
					System.out.println(lst2);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	
	}
	
}
