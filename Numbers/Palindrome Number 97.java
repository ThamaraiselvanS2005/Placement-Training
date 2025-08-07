import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            int temp = n;
        int r = 0;
        
        if(n<0){
            System.out.println(false);
            return;
        }
     
        while(n != 0)
        {
            int a = n%10;
            r =( r * 10 )+ a;
            n /= 10;
        }
        
        
        if (r == temp)
            System.out.println(true);
        else 
            System.out.println(false);
    }
}
