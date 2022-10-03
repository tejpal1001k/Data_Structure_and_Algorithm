package String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        sb.append(sc.nextLine());
        System.out.println(sb);

        System.out.println(sb.subSequence(3 , 6));
        System.out.println(sb.reverse());
        System.out.println(sb);
        String str= String.valueOf(sb.reverse());
        System.out.println(str);
        System.out.println(sb.delete(0,1));
    }
}
