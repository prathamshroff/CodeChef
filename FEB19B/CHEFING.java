/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFING
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int arr[] = new int[26];
            for(int ctr = 0; ctr < N; ctr++)
            {
                String str = sc.next();
                int len = str.length();
                int temp[] = new int[26];
                for(int i = 0; i < len; i++)
                {
                    int ascii = str.charAt(i) - 97;
                    if(temp[ascii] == 0) temp[ascii]++;
                }
                for(int i = 0; i < 26; i++)
                {
                    arr[i] += temp[i];
                }
            }
            int ctr = 0;
            for(int i = 0; i < 26; i++)
            {
                if(arr[i] == N)
                {
                    ctr++;
                }
            }
            System.out.println(ctr);
            //System.out.println(arr[0] + " " + arr[2]);
        }
    }
}
