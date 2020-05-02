import java.util.*;
import java.lang.*;
import java.io.*;
class ZCO13001
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s[] = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++)
        {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        /*for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                counter += (s[i] > s[j])? s[i] - s[j]:s[j] - s[i];
            }
        }*/
        Arrays.sort(s);
        long revenue = 0;
        for(int i = 0; i < n; i++)
        {
            sum -= s[i];
            revenue += sum - (n-i-1)*s[i];
        }
        System.out.println(revenue);
    }
}