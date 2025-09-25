package Chapter7.Exercises.Page196;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        SailBoats b2 = new SailBoats();
        RowBoats b3 = new RowBoats();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}