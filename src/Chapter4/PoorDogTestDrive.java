// This class represents a "PoorDog"... poor because it’s got no values yet 😅
class PoorDog {
    // Dog’s size, but nobody bothered to set it… tragic.
    private int size;
    // Dog’s name, also empty... this pup has an identity crisis.
    private String name;

    // Getter for size (returns 0 if never set — poor guy)
    public int getSize() {
        return size;
    }

    // Getter for name (returns null if never set — ouch)
    public String getName() {
        return name;
    }
}

// Time to test-drive our sad little dog
public class PoorDogTestDrive {
    public static void main(String[] args) {
        // Making a dog, but not giving it food, love, or even a name 🐶💔
        PoorDog one = new PoorDog();

        // Prints "0" because size was never assigned
        System.out.println("Dog size is " + one.getSize());

        // Prints "null" because name was never assigned
        System.out.println("Dog name is " + one.getName());
    }
}
