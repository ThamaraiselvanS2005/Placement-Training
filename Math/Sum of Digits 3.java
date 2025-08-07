import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        
        if(n<0)
            n = -n;
        
        while(n != 0){
            
            sum = sum +(n%10);
            n = n/10;
        }
        System.out.println(sum);
    }
}
