package Chapter8.Summary;

// Abstract class
abstract class Animal {
    abstract void makeSound(); // Must be implemented by subclasses

    void sleep() {
        System.out.println("Zzz... 😴");
    }
}

// Interface
interface Pet {
    void play();
}

// Dog implements Pet, extends Animal
class Dog extends Animal implements Pet {
    @Override
    void makeSound() {
        System.out.println("Woof! 🐶");
    }

    @Override
    public void play() {
        System.out.println("Fetches the ball! 🎾");
    }
}

public class TestAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // from abstract class
        dog.play();      // from interface
        dog.sleep();     // inherited method
    }
}

