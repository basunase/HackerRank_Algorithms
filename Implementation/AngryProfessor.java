import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        int t = in.nextInt();
        for(int a_0 = 0; a_0 < t; a_0++){
              count = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                //System.out.println(a[a_i]);
            }
            for (int i = 0; i < a.length; i++)
                {
               
                if(a[i] <= 0)
                    count++;
                
            }
            if ( count >= k)
                System.out.println("NO");
            else
                 System.out.println("YES");
        }
    }
}
