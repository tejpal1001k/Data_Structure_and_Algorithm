import java.util.Scanner;

class Vehicle{
    int maxSpeed =150;

    Vehicle(){


        System.out.println("Maximum speed of the vehicle is : "+maxSpeed );
    }
}
class Splinder extends Vehicle{
    int maxSpeed=120;
    Splinder(){
        super();
    }

    void show(){
        System.out.println("Maximum Speed is: "+maxSpeed);

        System.out.println("Maximum Speed is: "+super.maxSpeed);

    }

}
public class SuperKeywordExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Vehicle v1=new Vehicle();
        Splinder sp=new Splinder();
        sp.show();

    }
}
