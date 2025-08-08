import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int oddcount = 0;
        int evencount = 0;
        int arr[] = new int[n];
        
        for(int i = 0; i< n ;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0 ; i <n ;i ++)
        {
            if(arr[i]%2 == 0 )
                oddcount++;
            else
                evencount++;
        }
        System.out.println(oddcount);
        System.out.println(evencount);
    }
}
