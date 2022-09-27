package Searching;

import java.util.Scanner;

public class LinearSearch {
    //WAP to search an element in an array via linear search
    public static boolean linearSearch(int[] arr,int num){
        int i=0;
        while (i<arr.length) {
            if(arr[i]==num){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        System.out.println(linearSearch(arr,num));



    }
}

