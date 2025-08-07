import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        if (n<0)
            n = n *-1;
        
        if(n == 0)
        {max = 0;
            min = 0;
        }
        

        while(n!= 0)
        {
          int a = n % 10;
          if(max < a){
              max = a;
          }
        else if(min>a) {
               min = a; 
            }
            else if(a == 0){
                min = a;
            }
         n = n /10;
          
        }
        
        System.out.println(max +" "+min);
        
    }
}
