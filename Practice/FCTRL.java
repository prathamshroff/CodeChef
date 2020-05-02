import java.util.*;
import java.lang.*;
import java.io.*;
class FCTRL
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        for(long i = 0, zero = 0, n; i < nn; i++, zero = 0)
        {
            n = sc.nextLong();
            for(long j = 5; j <= n; j *= 5)
            {
                zero += n/j;
            }
            System.out.println(zero);
        }
    }
}