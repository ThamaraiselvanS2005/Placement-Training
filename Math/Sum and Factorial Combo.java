import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int sum = 0;
          int f = 1;
          
          for(int i = 1;i<=n;i++) {
              sum = sum + i;
          }
          System.out.println(sum);
          
          
          for(int i = 1;i<=n;i++) {
              f = f * i;
          }
          System.out.println(f);
    }
}
