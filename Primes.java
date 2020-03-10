import java.util.Scanner;

public class Solution {

    // Counter of prime numbers in my interval
    static int countPrimes = 0;

    public static void main(String args[]) {
        // Input the lower and upper limit of the interval, using the keyboard
        int s1,s2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        s1 = s.nextInt();
        System.out.print("Enter the upper limit: ");
        s2 = s.nextInt();

        System.out.println(String.format("Prime numbers from %d to %d are : ", s1, s2));

        // Looping through the interval and checking which number is a prime
        for (int i = s1; i <= s2; i++)
        {
            // Calling the isPrime method
            isPrime(i);
        }

        // Printing on screen the amount of primes i found in the interval
        System.out.println(String.format("There is a total of %d prime numbers.", countPrimes));
    }

    private static void isPrime(int i){
        int counter=0;

        for(int num=i; num>=1; num--)
        {
            if(i%num==0)
            {
                counter = counter + 1;
            }
        }

        // checking if the number (i) is divisible only by itself and by 1. If so, the number (i) is a prime number.
        if (counter ==2)
        {
            System.out.println(i);
            countPrimes++;
        }
    }
}
