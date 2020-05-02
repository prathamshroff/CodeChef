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
            int n = sc.nextInt();
            int a[] = new int[n+2];
            int d[] = new int[n+2];
            int attack, shield = -1;
            for(int i = 1; i <= n; i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i = 1; i <= n; i++)
            {
                d[i] = sc.nextInt();
            }
            a[0] = a[n]; d[0] = d[n];
            a[n+1] = a[1]; d[n+1] = d[1];
            
            /*for(int i = 0; i < n+2; i++)
            System.out.print(a[i] +" ");
            
            for(int i = 0; i < n+2; i++)
            System.out.print(d[i] +" ");*/
            
            for(int i = 1; i <=n; i++)
            {
                attack = a[i-1]+a[i+1];
                if(d[i] > attack && d[i] > shield)
                shield = d[i];
            }
            System.out.println(shield);
        } 
	}
}
