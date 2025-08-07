import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int p = 1;
        
        for(int i = 1 ;i<=b;i++)
        {
            p = p * a;
        }
        System.out.println(p);
    }
      
}
