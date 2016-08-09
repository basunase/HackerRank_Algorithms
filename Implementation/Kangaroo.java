import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
       if (v1 != v2){
           int test = (x1-x2) % (v1-v2);
           System.out.println(test);
           int test1 = (x1-x2) / (v1-v2);
           System.out.println(test1);
           if ((test == 0) && (test1 >= 0))
               System.out.println("YES");
           else
               System.out.println("NO");
       }else{
            System.out.println("NO");
       }
    }
}
               
            
            
        
        
