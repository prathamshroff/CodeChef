/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class INAL2019
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long R = sc.nextInt();
        long i, sum = 0;
        for(i = 1;; i++)
        {
            sum += (i * R);
            if(sum > K)
            {
                i--;
                break;
            }
        }
        System.out.println(N - i);
    }
}
