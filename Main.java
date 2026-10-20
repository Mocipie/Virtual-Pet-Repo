/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

		// Print information about the pets
<<<<<<< HEAD
        System.out.println("Wheres the lunch :(");
=======
        System.out.println("Im so hungryyyyy.... i wish i had a fre bag of chipsss.");
>>>>>>> 9ee1f2f806fb1e085fa2ecf0710d72bab2733c31
        dog.bark();
        cat.meow();

        dog.feed();
        cat.play();

        dog.showStatus();
        cat.showStatus();
    }
}
