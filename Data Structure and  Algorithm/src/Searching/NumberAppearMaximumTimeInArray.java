package Searching;

import java.util.Scanner;
//this question is about numbers of rotations
//but this method is not optimised

public class NumberAppearMaximumTimeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
//        complexity of below code is O(n*n)
//        int count=0,max=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>max) max=count;
//        }
//        System.out.println(max);

        //** Optimised method first sort the array and then compare adjcent elements


    }
}
