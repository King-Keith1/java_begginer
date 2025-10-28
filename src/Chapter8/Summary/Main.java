package Chapter8.Summary;

abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping... 💤");
    }
}

interface Pet {
    void play();
}

class Cat extends Animal implements Pet {
    void makeSound() {
        System.out.println("Meow! 🐱");
    }
    public void play() {
        System.out.println("Playing with yarn 🧶");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound(); // Meow!
        myCat.play();      // Playing with yarn 🧶
        myCat.sleep();     // Sleeping... 💤
    }
}

