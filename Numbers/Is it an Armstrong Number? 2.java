import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static int count(int n ){
        int count = 0;
        while(n !=0)
        {
            count++;
            n = n/10;
        }
        return count;
    }
    
    public static int sum(int n ,int count)
    {
        int sum = 0;
        while (n!=0)
        {
            int a = n%10;
            int power = (int)Math.pow(a,count);
            sum += power;
            n /= 10;
            
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int c = count(n);
        int result = sum(n,c);
        if(result == n)
            System.out.println(true);
        else
            System.out.println(false);
        
        
    }
}
