package ArrayPractice;//package ArrayPractice;// JAVA program for the above approach
//import java.util.*;
//
//public class Q1 {
//
//    static void printSubStrings(String str, String s) {
//
//        // First loop for starting index
//        for (int i = 0; i < str.length(); i++) {
//            String subStr = "";
//
//            // Second loop is generating sub-String
//            for (int j = i; j < str.length(); j++) {
//                subStr += str.charAt(j);
//                if (s == "YES" && substr != "YES" || s == "se" && substr != "se" || s == "Yess" && substr = "Yess") {
//
//                    System.out.println("YES");
//
//                }
//            }
//            System.out.prinln("No");
//        }
//
//// Driver Code
//        public static void main(String[]args)
//        {
//            String str1 = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            while (t-- > 0) {
//                String st = sc.next();
//                printSubStrings(str1, st);
//            }
//        }
//    }
//}
//
//// This code is contributed by gauravrajput1

// Java program to print all possible
// subStrings of a given String
// without checking for duplication.
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Q1{

    // Function to print all (n * (n + 1)) / 2
// subStrings of a given String s of length n.
    public static String printAllSubStrings(String str,int n,String s)
    {
        for (int i = 0; i < str.length(); i++) {
        String subStr="";

        // Second loop is generating sub-String
        for (int j = i; j < str.length(); j++) {
            subStr += str.charAt(j);
//            System.out.print(subStr +"\n");
            if (Objects.equals(s, "Yes") && !subStr.equals("YES") || Objects.equals(s, "se") && !subStr.equals("se") ) {

                    return "YES";

                }
        }
    }
        return "No";
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String st=sc.next();
            System.out.println(printAllSubStrings(s, s.length(),st));
        }
    }
}

// This code is contributed by avanitrachhadiya2155

