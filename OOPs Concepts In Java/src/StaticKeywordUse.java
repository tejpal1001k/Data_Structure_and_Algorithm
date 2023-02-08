
public class StaticKeywordUse {
    //This is perform call by add() method with static keyword
    public static void add(int a,int b){
        int sum=a+b;
        System.out.println("Addition of a and b: "+ sum);

    }
    //This is perform by call by add1() without static keyword and it will throw an error.
    public void add1(int a,int b){
        int sum=a+b;
        System.out.println("Addition of a and b: "+ sum);

    }
//This is perform by object without static keyword
    public void add2(int a,int b){
        int sum=a+b;
        System.out.println("This is perform by object without static keyword Addition of a and b: "+ sum);
    }
    public static void main(String []arge){
        add(10,11);
//        add1(10,12);
        StaticKeywordUse obj=new StaticKeywordUse();
        obj.add2(1,2);

    }
}
