package SpickerVererbung;

public class array_of_objects {
	public static void main(String []args) {
		
		//food[] fridge = new food [3];
		//andere methode nutzen, um array zu definieren
		
		food food1 = new food("Pizza");
		food food2 = new food("Burger");
		food food3 = new food("cheese");
		
		//ARRAY OF OBJECTS
		
		food[] fridge = {food1,food2,food3};
		
		//objecte in array 
		
		/*fridge[0]= food1;
		fridge[1]= food2;
		fridge[2]= food3;
		*/
		
		//access one of the elements
		//.name prints [0} name
		System.out.println(fridge[0].name);
		System.out.println(fridge[2].name);
		System.out.println(fridge[1].name);
	}
}