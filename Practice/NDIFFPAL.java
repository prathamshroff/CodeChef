/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		/* if you make all characters different the palindromes will all be
		   blank, so if no consecutive letter is the same no. of characters is 
		   equal to no. of palindromes */
		   
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-- > 0)
	    {
	        int n = sc.nextInt();
	        char ch = 'a';
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(ch);
	            if(ch == 'z')
	            {
	                ch = 'a';
	            }
	            else
	            {
	                ch++;
	            }
	        }
	        System.out.println();
	    }
	}
}
