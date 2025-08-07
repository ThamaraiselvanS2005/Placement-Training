import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int square = n * n; //or Math.pow(n,2);
        
        while (square != 0)
        {
            int a = square %10;
            sum += a;
            square /= 10;
        }
        if (sum ==n)
            System.out.println(true);
        else
            System.out.println(false);
        
    }
}
