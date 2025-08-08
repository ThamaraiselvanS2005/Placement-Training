import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int oddsum = 0;
        int oddindex = 0;
        int evensum = 0;
        int evenindex = 0;
        
        for(int i = 0; i< n ;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0 ; i < n ;i ++)
        {
            if(arr[i]%2 == 0 )
                evensum += arr[i];
               
            else
                oddsum += arr[i];
        }       
        
        
        for(int i = 0 ; i < n ;i ++)
        {
            if(i%2 == 0 )
                evenindex += arr[i];
            
            else
                oddindex += arr[i];
            
        }
        
        System.out.print(evensum+" ");
        System.out.print(oddsum+" ");
        System.out.print(evenindex+" ");
        System.out.print(oddindex);
        
       
    }


    }
