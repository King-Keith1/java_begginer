package Chapter10.Summary;

public class StaticDemo {
    static int counter = 0; // Shared across all instances

    StaticDemo() {
        counter++;
    }

    static void showCount() {
        System.out.println("Objects created: " + counter);
    }

    public static void main(String[] args) {
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        StaticDemo.showCount(); // Objects created: 2

        double result = Math.sqrt(16); // Static method usage
        System.out.println("Square root of 16: " + result);

        Integer num = 42;  // Auto-boxing example
        System.out.println("Integer object value: " + num);
    }
}

