//RECTANGULAR PATTERN

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        
        for(int i = 0; i < r ; i++)
        {
            for(int j =0 ;j < c ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*****
*****
*****

//CIRCULAR PATTERN

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i<n ; i++){
            for(int j = 0; j <n ;j ++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

****
****
****
****


//STAIR CASE PATTERN

  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j<=i ;j++){
                System.out.print("*");
                
                
            }
            System.out.println(" ");
        }
    }
}



*
**
***
****



//Descending Star Steps

  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = n-1; i >= 0 ; i--){
            for(int j = 0 ; j<=i ;j++){
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }
}

****
***
**
*



  //Diagonal Stars


  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i<n ; i++){
            for(int j = 0; j <n ;j ++)
            {
                if(i ==j)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}


*   
 *  
  * 
   *

  //Star Box Frame



  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i<n ; i++){
            for(int j = 0; j <n ;j ++)
            {
                if(i ==0 || j == 0 || i == n-1 || j == n-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}

* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 
