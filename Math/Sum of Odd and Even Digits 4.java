import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if(n< 0){
            n = -n;
        }
        int even = 0;
        int odd = 0;
        
        while(n!= 0)
        {
          int a = n % 10;
          if(a % 2 == 0){
              even = even + a;
          }
            else{
               odd = odd + a; 
            }
         n = n /10;
          
        }
        
        System.out.println(odd +" "+even);
        
    }
}
