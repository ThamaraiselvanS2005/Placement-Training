import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int min = Integer.MAX_VALUE;
        
        
        for(int i = 0; i<n ; i ++)
        {
            a[i] = scan.nextInt();
        }
        
        
        
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] < min)
                min = a[i];
            
        }
        System.out.println(min);
     
    }
}
