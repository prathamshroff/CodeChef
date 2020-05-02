/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    short flag = 0;
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    long total = 0;
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = sc.nextInt();
		        total += a[i];
		    }
		    if(total%n == 0)
		    {
		        long avg = total/n;
		        for(int i = 0; i < n; i++)
		        {
		            if(a[i] == avg)
		            {
		                System.out.println(i+1); flag = 1;
		                break;
		            }
		        }
		    }
		    if(flag == 0)
		    System.out.println("Impossible");
		}
	}
}
