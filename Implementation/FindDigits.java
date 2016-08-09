import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ttc = sc.nextInt();
        int count,rem,n,temp;
        for (int i = 1; i <= ttc; i++){
            n = sc.nextInt();
            temp = n;
            count = 0;
            while( n > 0) {
                rem = n % 10;
                n = n / 10;
                if( rem != 0 && (temp % rem == 0))
                    count++;
            }
        System.out.println(count);
        }
        
    }
}