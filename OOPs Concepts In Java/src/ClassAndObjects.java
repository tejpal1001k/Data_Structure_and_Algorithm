class Box{
    //    Member variables
    int heigth;
    int wedith;
    int depth;

}

public class ClassAndObjects {
    public static void main(String []args){
        Box obj=new Box();
        //Assigning values to obj instance variables
        obj.heigth=9;
        obj.wedith=3;
        obj.depth=20;
        int volume=obj.depth*obj.heigth*obj.wedith;
        System.out.println("Volume of the box is : "+volume);
    }

}

