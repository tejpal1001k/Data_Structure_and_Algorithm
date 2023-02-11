public class StaticTest {

        static int x = 10;
//        int x1=10; //will throw an error
        public static void main(String []args) {
            System.out.print(x);
        }



    static {
            System.out.println(x + 10);
        }
    static {
//        System.out.println(x1 + 10);
//        this will run time error
    }

    }

