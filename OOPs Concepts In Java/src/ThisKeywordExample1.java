public class ThisKeywordExample1 {
    ThisKeywordExample1(){
        System.out.println("Hy, I am defaukt constructor");
    }

    void show(){
        this.print();
        System.out.println("hy I am show method");
    }
    void print(){
        System.out.println("Hy I am Print function");
    }
    public static void main(String[] args) {
        ThisKeywordExample1 obj=new ThisKeywordExample1(); //this will invoke default Constructor only
        obj.show();// this will invoke show method and  show method will invoke the print method
        //so the output will be like this
        /**
         *
         * Hy I am Print function
         * hy I am show method
         *
         */
    }
}
