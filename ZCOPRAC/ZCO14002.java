/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		a[i] = sc.nextInt();
		if (n < 3)
		{
		    System.out.println("0");
		    System.exit(0);
		}
		int mins[] = new int[n];
		for(int i = 0; i < 3; i++)
		mins[i] = a[i];
		for(int i = 3; i < n; i++)
		mins[i] = a[i] + minimum(mins[i-1], mins[i-2], mins[i-3]);
		System.out.println(minimum(mins[n-1], mins[n-2], mins[n-3]));
	}
	public static int minimum(int a, int b, int c)
	{
	    int m = Math.min(a,b);
	    m = Math.min(c,m);
	    return m;
	}
}
