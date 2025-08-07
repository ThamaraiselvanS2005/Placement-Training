import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int temp = n;
        int sum = 0;
        
        while(n != 0 )
        {
            int a = n %10;
            sum += a;
            n /= 10;
        }
        
        if(temp % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
    
}
