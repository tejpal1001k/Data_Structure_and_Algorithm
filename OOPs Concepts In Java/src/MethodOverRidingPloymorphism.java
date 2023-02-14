class Parent{
    public void show(){
        System.out.println("Inside parent class");
    }
}
class Subclass1 extends Parent{
    public void show(){
        System.out.println("Inside Subclass1 ");
    }
}
class Subclass2 extends Parent{
    public void show(){
        System.out.println("Inside Subclass2");
    }
}

public class MethodOverRidingPloymorphism {
    public static void main(String[] args) {
        Parent p;
        p=new Subclass1();
        p.show();
        p=new Subclass2();
        p.show();

    }
}
