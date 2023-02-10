public class ConstructorExample {
//    public ConstructorExample() {
//        System.out.println("This is No argument constructor example");
//    }
    String str;
    public ConstructorExample(String s) {
        str=s;
    }
    public void show(){
        System.out.println(str);
    }
    public static void main(String[] args) {
//        ConstructorExample obj=new ConstructorExample();
        ConstructorExample obj2=new ConstructorExample("Hello This is an example of argument constructor");
        obj2.show();

    }
}
