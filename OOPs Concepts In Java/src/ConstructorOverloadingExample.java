
import java.util.Scanner;

class Employee{
    int salary;
    String name;
    int empId;
    Employee(){
    System.out.println("This is default constructor");
    }
    Employee(int eid ){
        empId=eid;
    }
    Employee(int eid, String s){
        empId=eid;
        name=s;
    }
    public void show(){
        System.out.println("Employe Id is :"+empId);
    }
    public void show1(){
        System.out.println("Employe Id is :"+empId + "  Employee name is: "+name);

    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();//Invoking the  default constructor
        System.out.println("Enter emp id");
        Employee obj1= new Employee(sc.nextInt()); //This is single argument constructor which overloads the emp class
        System.out.println("Enter emp id and employee name ");
        Employee obj2=new Employee(sc.nextInt(),sc.nextLine());
        obj1.show();
        obj2.show1();

    }
}
