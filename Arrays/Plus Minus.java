import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int plus = 0;
        int minus = 0;
        int zeros = 0;
        
        
        for(int i = 0; i<n ; i ++)
        {
            a[i] = scan.nextInt();
        }
        
        
        
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] < 0)
                minus++;
            else if(a[i] == 0)
                zeros++;
            else
                plus++;
            
        }
        
        int len = a.length;
        float m = (float)minus / len;
        float z = (float)zeros / len;
        float p = (float)plus /len;
        
        System.out.printf("%6f\n",p);
        System.out.printf("%6f\n",m);
        System.out.printf("%6f",z);
        
                


        
        
    }
}
