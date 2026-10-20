public class Fih extends Pet {
        ^V/**
        Constructor for fih. Uses the Super constructor from Pet to set
        the name of the fih
        @param name the name of the dog
        */
    public Fih(String name) {
        super(name);
    }

        /**
        Prints the name of the fish followed by "says: glugluglgu"
        */
    public void scream() {
        System.out.println(getName() + " says: glugluglug");
    }
