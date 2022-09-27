package PracticeQuestions;

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework


class ReturnTwoPrimeNumber {
    static boolean isPrime(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int n=sc.nextInt();
            int count=0;
            int []arr=new int[n];
            for(int i=2;i<=n;i++){

                if(isPrime(i)){
                    count++;
                    //System.out.println(i);
                    arr[count-1]=i;

                }
            }
//            for(int i=0;i<count;i++){
//                System.out.println(arr[i]);
//            }
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==n){
                        System.out.print(arr[i]+" "+arr[j]);
                        break;
                    }
                }
            }

//            System.out.println();

            T--;
        }

    }
}