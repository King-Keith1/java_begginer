package Chapter4.Summary;

// File: CatTestDrive.java
class Cat {
    private String name;
    private int age;

    // Constructor
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulated accessors
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    // Example of overloading
    public void play() {
        System.out.println(name + " is playing with a ball.");
    }

    public void play(String toy) {
        System.out.println(name + " is playing with a " + toy + ".");
    }

    public int getAgeNextYear() {
        return age + 1; // returns a value
    }
}

public class CatTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat("Luna", 3);

        cat.meow();
        cat.play();
        cat.play("string toy");

        System.out.println(cat.getName() + " will be " + cat.getAgeNextYear() + " next year.");

        cat.setName("Mochi");
        System.out.println("New name: " + cat.getName());
    }
}

