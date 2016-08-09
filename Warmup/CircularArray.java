import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int temp = 0, index = 0;
        int [] ar = new int[n];
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        
        for (int j = 0; j < q; j++){
            temp = sc.nextInt();
            index = temp - k % n;
            if(index < 0)
                index += n;
            System.out.println(ar[index]);
        }
    }
}