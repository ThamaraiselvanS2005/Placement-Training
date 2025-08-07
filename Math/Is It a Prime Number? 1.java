import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

if (n <= 1) {
    System.out.println("Not Prime");
    return;
}

boolean isPrime = true;
for (int i = 2; i <= n-1; i++) {
    if (n % i == 0) {
        isPrime = false;
        break; // optional optimization
    }
}

if (isPrime)
    System.out.println("Prime");
else
    System.out.println("Not Prime");

    }
}
