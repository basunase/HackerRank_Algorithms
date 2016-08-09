import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, i = 0;
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
           }
        while(true){
            if (i+2 < n && c[i+2] == 0){
                i += 2;
            }else if(i+1 < n){
                i++;
            }else{
                break;
            }
            count++;
        }
           
            
        System.out.println(count);
        
    }
}
