package Chapter2.Exercise_2_Pg_44;

//public class EchoTestDrive {
//    public static void main(String [] args) {
//        Echo e1 = new Echo();
//        Echo e2 = new Echo();
//
//        int x = 0;
//        while ( x < 4 ) {
//            e1.hello();
//            e1.count = e1.count + 1;
//
//            if ( x == 4 ) {
//                e2.count = e2.count + 1;
//            }
//
//            if ( x < 4 ) {
//                e2.count = e2.count + e1.count;
//            }
//            x = x + 1;
//        }
//        System.out.println(e2.count);
//    }
//}

//Bouns Question
public class EchoTestDrive {
    public static void main(String [] args) {
        Echo e1 = new Echo();
        Echo e2 = e1;
        int x = 0;
        while ( x < 4 ) {
            e1.hello();
            e1.count = e1.count + 1;
            if ( x > 0 ) { // True for x = 1, 2, 3
                e2.count = e2.count + 1;
            }
            if ( x > 1 ) { // True for x = 2, 3
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
