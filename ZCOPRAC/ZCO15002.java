import java.util.*;
import java.lang.*;
import java.io.*;
class ZCO15002
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        long a[] = new long[N];
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < N - 1; i++)
        {
            long min = a[i] + K;
            for(int j = i + 1; j < N; j++)
            {
                if(a[j] >= min)
                {
                    sum += (N-j);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}