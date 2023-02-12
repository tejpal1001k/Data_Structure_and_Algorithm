class Class{
    Class(){
        System.out.println("Parent class default Constructor");
    }
}
class Student extends Class{
    Student(){
        super();            //Invoke parent class constructor
        System.out.println("sub class constructor");
    }

}

public class SuperKEywordExample1 {
    public static void main(String[] args) {
        Student s=new Student(); //invoke sub-class constructor
    }
}
