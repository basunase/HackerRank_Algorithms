import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
          // System.out.println(a[a_i]);
            for (int i = 0; i <= a.length-1; i++)
            {
                for (int j = 0; j <= a.length-1; j++ )
                {
                 if ((i < j) && (((a[i] + a[j]) % k) == 0)) 
                   count++;       
                     
                }  
            } System.out.println(count); 
       
    }
}
