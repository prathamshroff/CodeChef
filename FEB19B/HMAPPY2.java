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
    	try {
    		    
    		Scanner sc = new Scanner(System.in);
    		int T = sc.nextInt();
    		while(T-- > 0)
    	    {
    	        long N = sc.nextLong();
    	        long A = sc.nextLong();
    	        long B = sc.nextLong();
    	        long K = sc.nextLong();
    	        //long ctr = 0;
    	        
    	        /*for(int i = 1; i <= N; i++)
    	        {
    	            if(i % A == 0 && i % B != 0)
    	            ctr++;
    	            else if(i % B == 0 && i % A != 0)
    	            ctr++;
    	        }*/
    	        
    	        /*for(int i = A; i <= N; i+=A)
    	        {
                    if(i % B != 0)
                    ctr++;
    	        }
    	        for(int i = B; i <= N; i+=B)
    	        {
                    if(i % A != 0)
                    ctr++;
    	        }*/
    	        
    	        long ctr = (N / A) + (N / B) - (N/ ((A*B)/(gcd(A,B))) )*2;
    	        //System.out.println(ctr);
    	        if(ctr >= K)
    	        System.out.println("Win");
    	        else
    	        System.out.println("Lose");
    	    }
    	} catch(Exception e) {
        		}
	}
	public static long multiple(long n1, long n2)
	{
	    long larger, smaller, lcm = 0;
	    if(n1>n2)
	    {
	        larger = n1;
	        smaller = n2;
	    }
	    else
	    {
	        larger = n2;
	        smaller = n1;
	    }
	    for(long i = larger; i > 0; i+= larger)
	    {
	        if(i % smaller == 0)
	        {
	            lcm = i;
	            break;
	        }
	    }
	    return lcm;
	}
	public static long gcd(long n1, long n2)
	{
	    if(n2 == 0)
	    return n1;
	    else
	    return gcd(n2, n1 % n2);
	}
}
