package Chapter7.Summary;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound 🐾");
    }
}

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

public class Zoo {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Polymorphism
        Animal a2 = new Cat();

        a1.makeSound(); // Calls Dog version
        a2.makeSound(); // Calls Cat version
    }
}

