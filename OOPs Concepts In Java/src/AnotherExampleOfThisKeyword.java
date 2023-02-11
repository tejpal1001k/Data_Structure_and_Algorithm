public class AnotherExampleOfThisKeyword {
    int a,b;
    AnotherExampleOfThisKeyword(){ //default constructor
        this(10,20); //this will invoke the paramiterised constructor first then
        // the code will go to the next line
        System.out.println("Default constructor");
    }
    AnotherExampleOfThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Inside the parametrised constructor, and valuse of a is: "+a+" and b is:  " + b);
    }
    public static void main(String[] args) {
        AnotherExampleOfThisKeyword obj=new AnotherExampleOfThisKeyword();

    }
}
