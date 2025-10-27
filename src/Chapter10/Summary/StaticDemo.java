package Chapter10.Summary;

public class StaticDemo {
    static int totalDogs = 0;  // Shared across all dogs
    String name;               // Unique per dog

    StaticDemo(String name) {
        this.name = name;
        totalDogs++;
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }

    static void showTotalDogs() {
        System.out.println("🐾 Total dogs created: " + totalDogs);
    }

    public static void main(String[] args) {
        StaticDemo d1 = new StaticDemo("Rex");
        StaticDemo d2 = new StaticDemo("Bella");

        d1.bark();
        d2.bark();

        StaticDemo.showTotalDogs(); // Access via class name

        // Wrapper class example
        Integer num = 10;   // autoboxing (int -> Integer)
        int sum = num + 5;  // unboxing (Integer -> int)
        System.out.println("Sum using wrapper: " + sum);
    }
}
