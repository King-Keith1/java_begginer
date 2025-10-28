package Chapter7.Summary;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound 🐾");
    }
}

// Subclasses
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! 🐶");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! 🐱");
    }
}

// Test class
public class Zoo {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Polymorphism in action
        Animal a2 = new Cat();

        a1.makeSound(); // Woof! (Dog version)
        a2.makeSound(); // Meow! (Cat version)

        // Even though both are "Animals", each acts differently
    }
}

