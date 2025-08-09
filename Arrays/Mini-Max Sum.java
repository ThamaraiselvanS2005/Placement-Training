import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        long a[] = new long[5];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = 0;
        
        
        for(int i = 0; i<5 ; i ++)
        {
            a[i] = scan.nextInt();
        }
        
        
        //MAX
        for(int i = 0 ; i < 5 ; i++)
        {
            if(a[i] > max)
                max = a[i];
            
        }
        
        //MIN
         for(int i = 0 ; i < 5 ; i++)
        {
            if(a[i] < min)
                min = a[i];
            
        }
        
        //SUM
        for(int i = 0 ; i < 5 ; i++)
        {
                sum = sum + a[i];
        }

        long mas = sum - min;
        long mis = sum - max;
        System.out.print(mis+" ");
        System.out.println(mas);

     
    }
}
