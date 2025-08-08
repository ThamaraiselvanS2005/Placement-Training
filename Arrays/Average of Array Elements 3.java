import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mid = 0;
        int sum = 0;
        int a[] = new int[n];
        
        for(int i = 0; i<n ; i ++)
        {
            a[i] = scan.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            sum = sum + a[i];
        }
        
        
        mid = sum/n;
        System.out.println(mid);
    }
}
