
import java.util.* ;
        import java.io.*;
        import java.io.*;
        import java.util.*;

class Car {
    int noOfGear;
    String color;
    // Write your constructor and printCarInfo method here.
    Car(){}
    Car(int noOfGear, String color){
        this.noOfGear=noOfGear;
        this.color=color;
    }
    public void printCarInfo(){
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("color: "+color);
    }

}

class RaceCar extends Car {
    int maxSpeed;
    // Write your constructor and printRaceCarInfo method here.

    RaceCar(int noOfGear, String color, int maxSpeed){
        this.noOfGear=noOfGear;
        this.color=color;
        this.maxSpeed=maxSpeed;
    }
    public  void printInfo(){
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("color: "+color);
        System.out.println("maxSpeed: "+maxSpeed);
    }

}

class Solution {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();
        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        Car car=new Car(noOfGear,color);
        car.printCarInfo();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printInfo();

    }
}