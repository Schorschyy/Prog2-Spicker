

//allgemein comparable vergleicht
	Beispiel aus Folien:
	
//integer
	Integer x =4;
	Integer y = 7;
	Integer z = 7;
	
	//es sollen die Ergebnisse verglichen werden 
	
	int compareErgebnis1 = x.compareTo(y);
	int compareErgebnis2 = y.compareTo(x);
	int compareErgebnis3 = y.compareTo(z);
	
	System.out.println("x.compareTo(y) : "+compareErgebnis1);
	System.out.println("y.compareTo(x) : "+compareErgebnis2);
	System.out.println("y.compareTo(z) : "+compareErgebnis3);
	
	//Studentenidsortieren
	
	public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
==========================================================
	@Override 
	public int compareTo(Student student) {
		if(this.id==student.id) {
			return 0;
		} else if(this.id>student.id) {
			return 1;
		} else {
			return -1;
		}
	}
		}
	}
}
===========================================================
//Arraylist sortieren nach ID

	List<Student> studentList = new ArrayList<Student>();

	studentList.add(new Student(100, "Miller"));
	studentList.add(new Student (23, "Smith"));
	studentList.add(new Student(67, "Brooks"));

	for (int i=0; i< studentList.size(); i++) {
		System.out.println(studentList.get(i).getId()) + ":"+studentList.get(i)getName());
	}
	