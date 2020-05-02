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
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int r , c;
		int yn[] = new int[n];
		for(int i = 0; i < n; i++)
		{
		    r = sc.nextInt();
		    c = sc.nextInt();
		    if((r * c) % 2 == 0)
		        yn[i] = 0;
		    else
		        yn[i] = 1;
		}
		for(int i = 0; i < n; i++)
		{
		    if(yn[i] == 0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
