public class AccesModifires {
        public static void main(String []args){
//            System.out.println("Hello this is MAin one");
            Example obj=new Example();
            //Public
            obj.display();
            //private
//            obj.display1(); // This is trying to call the private class so this will show an error
            //java: display1() has private access in example
           //default
            obj.display2();
            //Procted
            obj.display3();
            add(10, 20);

        }


        // Static method
        public static void add(int a, int b) {
            int sum = a + b;
            System.out.println(sum);
        }





}
class Example{
        private void display1(){
//            public int x=10;
//            this will also show an error because public cant be display in private class.
            System.out.println("Hello this is private Display Class one");
        }
        public void display(){
            System.out.println("Hello this is public Display Class one");
        }

        //*********** Default access modifier *******
  /*  If a class, data member, or method is not declared with any modifiers,
    it is considered as a default modifier in Java.
    The specialty of default access modifiers is that they are only accessible inside the same package.
    If we attempt to access the default data members and methods from outside the package,
    the compiler will generate a compile-time error. Have a look at the example below.  */
         void display2(){
            System.out.println("Hello this is Default Display Class ");
        }
        /*iii) protected The protected access modifier allows access of data members and methods inside the same package and outside the package through inheritance. We'll learn about inheritance later.*/
    protected  void display3(){
        System.out.println("This class is protected Display class");
    }


}


