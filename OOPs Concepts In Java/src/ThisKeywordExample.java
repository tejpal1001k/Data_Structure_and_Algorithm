import java.util.Scanner;
//in this class parameters and
public class ThisKeywordExample {
    int a,b;
    public ThisKeywordExample(int a,int b) {
        this.a=a;  //here this keyword is referenceing the instance variable of current class
        this.b=b;

    }
    void show(){
        System.out.println("a is :"+a+" & "+"b is :"+b);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vale of a and b");
        ThisKeywordExample obj=new ThisKeywordExample(sc.nextInt(),sc.nextInt());
        obj.show();

    }
}
