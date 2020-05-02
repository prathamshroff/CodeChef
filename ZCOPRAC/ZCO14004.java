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
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
		    arr[i] = sc.nextInt();
		    
		}
		int max[] = new int[n+1];
		max[0] = 0;
		max[1] = arr[0];
		max[2] = arr[0] + arr[1];
		for(int i = 3; i <= n; i++)
		{
		    max[i] = arr[i - 1] + Math.max(arr[i - 2] + max[i - 3], max[i - 2]);
		    max[i] = Math.max(max[i], max[i - 1]);
		}
		System.out.println(max[n]);
	}
}
