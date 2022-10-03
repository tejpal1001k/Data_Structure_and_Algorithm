package Sorting;
import java.util.*;
import java.util.Scanner;

//import static java.util.Arrays.swap;

//import static Sorting.QuickSort.quickSort;

public class QuickSort {
    public static void swap(int arr[],int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int []arr, int s, int e){
        int count=0;
        int povit=arr[s];
        for(int i=s+1;i<=e;i++){
            if(arr[i]<povit){
                count++;
            }
        }
        int povitIndex=s+count;
        swap(arr,povitIndex ,s);
         int i=s,j=e;
         while(i<povitIndex && j>povitIndex){
             while(arr[i]<povit){
                 i++;
             }
             while(arr[j]>povit){
                 j--;
             }
             if(i<povitIndex && j>povitIndex){
                 swap(arr,i++,j--);
             }
         }
         return povitIndex;
    }
   public  static void quickSortalgo(int []arr,int s,int e){
       //base condition
       if(s>=e){
           return;
       }
       int p= partition(arr,s,e);
       quickSortalgo(arr,s,p-1);
       quickSortalgo(arr,p+1,e);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSortalgo(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
