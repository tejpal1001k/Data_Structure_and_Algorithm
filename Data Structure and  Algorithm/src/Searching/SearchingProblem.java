package Searching;

import java.util.Scanner;

import static java.lang.Math.abs;

public class SearchingProblem {
    //check any duplicates in the array


    //belwo method does not works
//    public static void checkDuplicates(int[] arr) {
//        for (int i=0;i<arr.length;i++){
//            if(arr[abs(arr[i])]<0){
//                System.out.println("duplicasy exist");
//                return;
//            }else arr[arr[i]] = -arr[arr[i]];
//        }
//        System.out.println("No duplicasy");
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //* Below Code have Complexity of  O(n^n)
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicasy occurs");
                    return;
                }
            }

        }System.out.println("No duplicasy");

        // we have to optimise this algoritham
        //checkDuplicates(arr);
    }


}
