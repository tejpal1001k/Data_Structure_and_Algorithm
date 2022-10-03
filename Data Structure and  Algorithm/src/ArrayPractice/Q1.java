package ArrayPractice;

/* package codechef; // don't place package name! */

import java.util.*;
        import java.lang.*;
        import java.io.*;
        import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Q1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long []arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();

            }
            int count=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    if(i==0){
                        count =count +1;
                    }
                    count=count +2;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
