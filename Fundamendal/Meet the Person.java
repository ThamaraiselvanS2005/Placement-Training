import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        double height = scan.nextDouble();
        scan.nextLine();
        String name = scan.nextLine().trim();
        //System.out.printf(name+" is " +age+ " years old and " +height+" meters tall.");
        System.out.printf("%s is %d years old and %.2f meters tall.\n", name ,age ,height);

    }
}
