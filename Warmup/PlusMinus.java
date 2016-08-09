import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if ((arr[arr_i]) > 0)
                count1++;
                else if((arr[arr_i]) < 0)
                    count2++;
                    else
                        count3++;
                
            
        }
        
        System.out.println((double)count1 /(double) n);
        
        System.out.println((double)count2  / (double)n);
        System.out.println((double)count3  / (double)n);
    }
}
