package Sorting;

import java.util.Scanner;

public class MergeSortQuestion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test=sc.nextInt();
        while(Test>0){
            int n=sc.nextInt();
            int[] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            implementMergeSort(arr,0,n-1);

            Test--;
            for(int i=0;i<n;i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void implementMergeSort(int[] arr, int s, int e)
    {
        if(s>=e){
            return;

        }
        int mid=s+(e-s)/2;
        implementMergeSort(arr, s,mid);
        implementMergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }
    static void merge(int []arr,int s,int e){
        int mid=(s+e)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int []first=new int [len1];
        int []second=new int [len2];

        int mainArrayIndex=s;
        for(int i=0;i<len1;i++){
            first[i]=arr[mainArrayIndex++];
        }
        mainArrayIndex=mid+1;
        for(int i=0;i<len2;i++){
            second[i]=arr[mainArrayIndex++];
        }

        int index1=0;
        int index2=0;
        mainArrayIndex=s;
        while(index1<len1 && index2<len2){
            if(first[index1]<second[index2]){
                arr[mainArrayIndex++]=first[index1++];
            }
            else{
                arr[mainArrayIndex++]=second[index2++];
            }
        }
        while(index1<len1){
            arr[mainArrayIndex++]=first[index1++];
        }
        while(index2<len2){
            arr[mainArrayIndex++]=second[index2++];
        }
    }
}
//    public static void merge(int [] arr, int s,int e){
//        // int mid=(s+e)/2;
//        int mid=s+(e-s)/2;
//        int len1=mid-s+1;
//        int len2=e-mid;
//        int[] arr1 =new int[len1];
//        int[] arr2 =new int [len2];
//        int MainArrayIndex=s;
//        for(int i=0;i<len1;i++){
//            arr1[i]=arr[MainArrayIndex++];
//        }
//        MainArrayIndex=mid+1;
//        for(int i=0;i<len2;i++){
//            arr2[i]=arr[MainArrayIndex++];
//        }
//        //merge the both sorted arrays
//        int index1=0,index2=0;
//        MainArrayIndex=s;
//        while(index1<len1 && index2<len2){
//            if(arr1[index1]<arr2[index2]){
//                arr[MainArrayIndex++]=arr1[index1++];
//            }
//            else{
//                arr[MainArrayIndex++]=arr2[index1++];
//            }
//        }
//        while(index1<len1){
//            arr[MainArrayIndex++]=arr1[index1++];
//        }
//        while(index2<len2){
//            arr[MainArrayIndex++]=arr2[index2++];
//        }
//    }
//}
