class Abc{//This class represent multiple instance block initalization
    Abc(){
        System.out.println("Default constructor");
    }
    {
        System.out.println("Instance initalization block 1");
    }
    {
        System.out.println("Instance initalization block 2");

    }
}
class InsatanceIniWithParentClass{
    InsatanceIniWithParentClass(){
        System.out.println("Default constructor of parent class");
    }
    {
        System.out.println("Parent Instance Init block");
    }
}
class Child extends InsatanceIniWithParentClass{
    Child(){
        super();
        System.out.println("Child class default constructor");
    }
    {
        System.out.println("Child class init block");
    }

}
public class InstanceInitBlock {
    public static void main(String[] args) {
        Abc obj=new Abc();//   This will initalized the Abc Constructor
        /*Output :-
        Instance initalization block 1
        Instance initalization block 2
        Default constructor
         */
        InsatanceIniWithParentClass obj2=new InsatanceIniWithParentClass();
        //initlized the InsanceInitWithParent class
        /*
        Output :-
        Parent Instance Init block
        Default constructor of parent class
         */

    }
}
