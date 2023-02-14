class MethodOverloadingExample{
    public int  multiply(int num1,int num2){
        return num1*num2;
    }
//    public void multiply(int num1,int num2){
//        System.out.println("Multiplication of 2 number is+ "+num1*num2);
//    }
    public int multiply(int num1,int num2, int num3){
        return num1*num2*num3;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloadingExample obj=new MethodOverloadingExample();
        System.out.println(obj.multiply(10,20));
        System.out.println(obj.multiply(10,20,30));


    }
}
