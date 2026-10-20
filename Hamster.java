/**
Class for defining a Hamster in a virtual pet simulator.
*/
public class Hamster extends Pet {
        /**
        Constructor for Hamster. Uses the Super constructor from Pet to set
        the name of the Hamster
        @param name the name of the hamster
        */
    public Hamster(String name) {
        super(name);
    }

        /**
        Prints the name of the hamster followed by "says: Squeak!"
        */
    public void squeak() {
        System.out.println(getName() + " says: Squeak!");
    }
}
