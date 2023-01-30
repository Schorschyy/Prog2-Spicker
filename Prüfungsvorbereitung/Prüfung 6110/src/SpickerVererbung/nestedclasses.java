Beispiel
public class innerouterclass {

	
	class OuterClass{
		private int outerNumber;
		private InnerClass innerclass;
		
		class InnerClass{
			int innerNumber;
			public InnerClass(int number) {
				innerNumber=number;
				innerClass=this;
			}
			private void innerMethod1() {
				System.out.println("outerNumber="+outerNumber);
				System.out.println("innerNumber="+innerNumber);
			}
		}
		
		public OuterClass(int number) {
			outerNumber=number;
		}
		public void outerMethod() {
			System.out.println("outerNumber="+outerNumber);
			innerClass.innerMethod1();
		}
	}
	
	in main 
	OuterClass outer1 = newOuterClass(1);
	OuterClass.InnerClass
		inner1 = outer1.new Innerclass(11);
	outer1.outerMethod();
	
	Outerclass outer2 = new OuterClass(2);
	OuterClass.InnerClass
		inner2 = outer2.new InnerClass(22);
	outer2.outerMethod();
	
}


PRIVATE INNER CLASS
-private or protected

class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
=========================================================
STATIC INNER CLASS
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}
========================================================
ACCESS OUTER CLASS FROM INNER CLASS
 class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

LOKAL CLASS
public class LocalClassExample {
	static String regularExpression = "[^0-9]";
	public static void validatePhoneNumber(String phoneNumber) {
		final int numberLength = 10;

		class PhoneNumber {
			String formattedPhoneNumber = null;
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}
			public String getNumber() {
				return formattedPhoneNumber;
			}
		}
		PhoneNumber myNumber = new PhoneNumber(phoneNumber);
		System.out.println(“Number is " + myNumber.getNumber());
	}
}

ANONYMOUS CLASS

public interface Greeting {
	public void greet();
	public void greetSomeone(String someone);
}
	public class HelloWorldAnonymous {
		public void sayHello() {
			Greeting englishGreeting = new Greeting() {
				String name = "world";
				public void greet() {
					greetSomeone("world");
				}
				public void greetSomeone(String someone) {
					name = someone;
					System.out.println("Hello " + name);
				}
			};
			englishGreeting.greet();
			englishGreeting.greetSomeone("Fred");
		}
	}
	HelloWorldAnonymous hello = new HelloWorldAnonymous();
	hello.sayHello();
	
	
	ÜBUNG
	
	public class OuterClass {
		public int number= 6;
		 
		 public void heyThere() {
			 System.out.println("Hey There");
			 
			 //local InnerClass
			 class LocalInnerClass{
				 String localInnerClassVar = "Hey Girl";
				 
				 public void printlocalInnerClassVar() {
					 System.out.println(localInnerClassVar); 
				 }
			 }
			 
			 LocalInnerClass lic =new LocalInnerClass();
			lic.printlocalInnerClassVar();
		 }
		
		 
		 //innere Klasse (ist element von outerclass)
		 //static inner class
		 public static class InnerClass{
			public int number = 8;
			 
			 public void helloThere() {
				 System.out.println("Hello outer");
			 }
			 //shadowing: ounter & inner class haben 2x gleiche Variabler
			 public static void shadowbsp(int number) {
				 System.out.println("shadowing");
			 }
		 }
		 
	}
	