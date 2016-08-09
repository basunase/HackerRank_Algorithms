import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ttc, n, m , s;
        ttc = sc.nextInt();
        for (int i = 1; i <= ttc; i++){
            n = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
            System.out.println((m+s-2)%n + 1);
        }
    }
}