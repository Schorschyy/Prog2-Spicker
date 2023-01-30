package SpickerVererbung;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	
	//Pfadangaben plattformunabharngig Vorlesung

	char sepChar = File.separatorChar;
	String sepString = File.separator;
	String sepStringSys = System.getProperty("file.separator");




	public class textdateieneinlesen{ 
	 
		public static void main(String[] args) {
		
			File datei = new File("/unterordner/datei.txt");
			
			
			//auf .txt eigenschaften gehen und Pfad bekommen,backslash in slash ändern 
			//Ueberpruefen ob Pfad richtig ist
			
			System.out.println(datei.isFile());
			
			//Folie: boolean dateiExists = datei.exists();
			//Länge der Datei ermitteln: long fileSite = datei.lenght();
			
			file.getPath oder file.getAbsolutPath //für Pfade der Datei
			
			//falls vorhanden nur letztes verzeichnis erstellen: boolean mkDirOk = tiefesverzeichnis.mkdir();
			//falls meheerere auch uebergeordnete erstellen: boolean mkDirsOk = tiefesVerzeichnis.mkdirs();
			
			//Datei einlesen
			Scanner scan;
			try {
				scan = new Scanner(datei);
			}catch(FileNotFoundException e) {
				System.out.println("File not found");
			//nur eine Zeile auslesen
			///}System.out.println(scan.nextLine());
			
				
				//Alles auslesen
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		
			
		}

			
			public class Textdateienschreibenundbearbeiten{
				//IN MAIN
				
				public static void main(String[] args) {
					File datei = new File("test.txt");
					//unwichtig weil exception - FileWriter schreiben = new FileWriter(datei);
					//exception abfangen
					try {
						FileWriter schreiben = new FileWriter(datei, true); //Erstellt Datei und hängt neue Speicherugn dran
						//ohne true wird komplett ueberschrieben
						schreiben.write("Hello\n"); //in die Datei wird hello geschrieben //writer.write
						schreiben.flush();//einschreiben                                  //writer.close
						schreiben.close();
					} catch (IOException e) {
						System.out.println("Datei konnte nicht bearbeitet werden");
						
					}
					
					
				}
			}

			
			//umbennenen oder bewegen einer Datei
			boolean renameOk = datei.renameTo(new File ("c:\\....\\mh.txt"));
			
			//datei oder verzeichnis loeschen
			boolean deleteOk = datei.delete();
			
			//pruefen ob file-instanz ein verzeichnis oder datei ist
			boolean isDirectory = tiefesVerziechnis.isDirectory();
			
			//Verzeichnis lesen
			File auszulesendesVerzeichnis = new File("c:/...");
			
			//Verzeichnis als Array von Strings
			String[] fileNames = auszulesendesVerzeichnis.list();
			
			//Verzeichnis als Array von Files
			File[] files = auszulesendesVerzeichnis.listFiles();
			
	//byteweises lesen
			public class DateiBytesLesen{
				public static void main(String[] args) {
					try {
						fis = new FileInputStream(new File("c:/daten/"));
						int input = fis.read();
						while(input!=-1) {
							System.out.println((char)input);
							input = fis.read();
						}
						
					}catch (IOException e) {
						//Fehlermeldugn ausgeben
						e.printStackTrace();
						}
					}
				}
			
		//Lesen einer Datei in Puffer und Buchstabe e zaehlen
			public class BuchstabeEzaehlen {
				public static void main(String[] args) {
				FileInputStream fis;
				File datei;
				int eCounter=0;
				try {
					datei = new File("c:/daten/temp/testtext.txt");
					fis = new FileInputStream(datei);
					byte[] pufferArray = new byte[(int) datei.length()];
					// Lesen in Datei bis Puffer voll oder Ende erreicht
					int anzahlBytesGelesen = fis.read(pufferArray);
					fis.close();
					int counter = 0;
					while(counter<anzahlBytesGelesen&&counter<pufferArray.length) {
					if((char)pufferArray[counter]=='e') {
						eCounter++;
					}
					counter++;
					}
				} catch (IOException e) {
					// Fehlermeldung ausgeben
					e.printStackTrace();
				}
				System.out.print("Anzahl Buchstabe e: "+eCounter);
			}
		}
		
			//Datei Zeilenweise einlesen
			
			//Wieviele Zeilen
			public class DateiZeilenweiseLesen{
				public static void main(String[] args) {
					FileReader fr;
					try {
						fr = new FileReader("c:/daten/test.txt");
						BufferedReader br = new BufferedReader(fr);
						
						int counter=0;
						String eineZeile= br.readLine();
						while(eineZeile!=null) {
							System.out.println("Zeile" +counter+ "\t" +eineZeile);
							eineZeile=br.readLine();
							counter++;
						}
						br.close();
					} catch (IOException e) {
						//Fehlermeldung ausgeben
						e.printStackTrace();
					}
				}
			//BufferedWriter DateiZeilenweiseSchreiben
			public class DateiZeilenweiseSchreiben{
				public static void main(String[] args) {
					FileWriter fw;
					try {
						fw = new FileWriter("c:/daten/test.txt");
						BufferedWriter bw = new BufferedWriter(bw);
						
						//int counter=0;
						String eineZeile;
						for(int i=0; i<5; i++) {
							eineZeile="Das ist eine Zeile" +i;
							bw.write(eineZeile);
							bw.newLine(); //Zeilenende plattformspezifisch
						}
						bw.close();
						
					} catch (IOException e) {
						//Fehlermeldung ausgeben
						e.printStackTrace();
					}
				}
			}
				
				
			//Objekte einlesen
			
			public class DateiinObjekteEinlesen{
				public static void main(String[] args) {
					List<Daten> listeDerObjekte = newArrayList<Daten>()
					FileReader fr;
					try {
						fr = new FileReader("c://.txt");
						BufferedReader br =new BufferedReader(fr);
						
						listeDerObjekte = new ArrayList<Daten>();
						
						String eineZeile = br.readLine();
						while(eineZeile!=null && !eineZeile.trim().equals("")) {
							StringTokenizer st = nwe StringTokenizer(eineZeile, ";");
							
							int nummer= Integer.parseInt(st.nextToken().trim());
							String bezeichnung = st.nextToken();
							String inhalt = st.nextToken();
							int wert = Integer.parseInt(st.nextToken().trim());
							
							Daten d = new Daten(nummer, bezeichnung, inhalt, listeDerObjekte.add(dc));
							
							eineZeile=br.readLine();
							
						}
						br.close();
					}catch(...)
				}
				
				
				
			}
			
			
			
			//Verzeichnisinhalt rekursiv ausgeben
			public static void main(String[] args) {
				//Verzeichnis lesen
				File auszulesendesVerzeichnis = new File("c:/daten/hm/");
				
			}
			public static void dateienRekursivAusgeben(File directory, int verzeichnistiefe) {
				if(directory.isDirectory()) {
					printDateiname(directory, verzeichnistiefe);
					File[] subDirectories = directory.listFiles();
					for (File file:subDirectories) {
						dateienRekursivAusgeben(file, verzeichnistiefe+1);
					}
					
				} else {
					printDateiname(directory, verzeichnistiefe);
				}
			}
			}
			
			//DATeinamen printen
			
			public static void printDateiname(File directory, int depth) {
				if(directory.isDirectory()) {
				for(int i=0; i<depth; i++) {
					System.out.println("-");
				}
			}else { 
				for(int i=0; i<depth; i++) {
					System.out.print("  ");
				}
				System.out.println(directory.getName());
				}
				}
			}
		}
}
