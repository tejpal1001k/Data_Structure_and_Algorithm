import java.util.Scanner;
public class EncapsulationMainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Class1 c=new Class1();
        System.out.println("Enter Student Id: and Name ");
//        System.out.println("Enter Student Name: ");
        c.setId1(sc.nextInt());
        c.setName(sc.nextLine());

        System.out.println("ID: " + c.getId1());
        /*
        these are only methods you can name anything you want
         */
        System.out.println("ID: " + c.setId());

        System.out.println("Name: " + c.getName());

    }
}
