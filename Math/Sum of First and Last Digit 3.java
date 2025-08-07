import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = 0;
        
        if(n <0)
            n = n *-1;
        
        
        int a = n %10;
        
        while (n >= 10)
        {
            n = n /10;
            b = n;
        }
        
        int res = a+b;
        System.out.println(res);
    }
}
