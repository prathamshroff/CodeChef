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
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if(A < B)
		    {
		        System.out.println("<");
		    }
		    else if(A > B)
		    {
		        System.out.println(">");
		    }
		    else
		    {
		        System.out.println("=");
		    }
		}
	}
}
