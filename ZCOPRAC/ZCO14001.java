import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        boolean pickdrop = false;
        int p = 0;
        int c = sc.nextInt();
        while(c!=0)
        {
            if(c == 1 && p > 0)
                p--;
            else if(c == 2 && p < (n-1))
                p++;
            else if(c == 3 && !pickdrop && a[p] > 0)
                { pickdrop = true; a[p]--; }
            else if (c == 4 && pickdrop && a[p] < h)
                { pickdrop = false; a[p]++; }
            c = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
            System.out.println(a[i] + "");
    }
}