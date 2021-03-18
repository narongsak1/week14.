package dog.com.it;

public class TestDog3 {
	public static void main(String[]args) {
		//create object here
		Dog Dog1 = new Dog("Bulldog", "larg", "light gray", 5);
		Dog1.methodDog1Display();
		
		Dog Dog2 = new Dog("Beagle", "larg", "orange", 6);
		Dog2.methodDog2Display();
		
		Dog Dog3 = new Dog("German sheherd", "larg", "white and orange", 6);
		Dog3.methodDog3Display();
	}
}
