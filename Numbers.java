//Automorphic Number 20

/*
An automorphic number is a number whose square ends with the same digits as the number itself.
For example, 76 → 76² = 5776 (ends with 76).
*/


import java.io.*;
import java.util.*;

public class Solution {
    
    public static int count(int s){
        int c = 0;
        while(s != 0){
            c++;
            s /= 10;
        }
        return c;
    }
    
    public static int rev(int s)
    {
        int reverse = 0;
        while(s != 0){
              int a = s%10;
              reverse = (reverse * 10) + a;
              s /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int s = n * n ;
        
        int reverse = rev(s);
        int c = count(s);
        
        for(int i = 1; i <= c/2 ;i++)
        {
            reverse /= 10;
        }
        int result = rev(reverse);
        
        if (result == temp)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
        
        
    }
}
