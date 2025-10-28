package Chapter4.Summary;

public class Dog {
    String name;  // instance variable (each Dog has its own)

    void bark() {
        System.out.println(name + " says: Woof! 🐶");
    }

    void rename(String newName) {
        this.name = newName;  // 'this' refers to the current object
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.rename("Buddy");
        dog2.rename("Luna");

        dog1.bark(); // Buddy says: Woof!
        dog2.bark(); // Luna says: Woof!
    }
}

