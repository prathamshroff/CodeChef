import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long budget[] = new long[n];
        long max = 0, temp = 0;

        for(int i = 0; i < n; i++)
        {
            budget[i] = sc.nextLong();
        }
        Arrays.sort(budget);
        for(int i = 0, j=n; i < n; i++, j--)
        {
            if(budget[i]*j > max)
            {
                max = budget[i]*j;
            }
        }
        System.out.println(max);
    }
}