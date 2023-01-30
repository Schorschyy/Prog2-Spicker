package DateiarbeitMD;

public class Datenbaustein {
		
		private int id;
		private String name;
		private String bezeichnung;
		private double wert;

		
		public Datenbaustein(int id, String name, String bezeichnung, double wert) {
			this.id=id;
			this.name=name;
			this.bezeichnung=bezeichnung;
			this.wert=wert;
			}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBezeichnung() {
			return bezeichnung;
		}

		public void setBezeichnung(String bezeichnung) {
			this.bezeichnung = bezeichnung;
		}

		public double getWert() {
			return wert;
		}

		public void setWert(double wert) {
			this.wert = wert;
		}

		
	}

