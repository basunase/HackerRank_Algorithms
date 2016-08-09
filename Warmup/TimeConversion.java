import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if (time.contains("AM")){
            time = time.replace("AM", " ");
            String arr[] = time.split(":");
            if (arr[0].equals("12")){
                arr[0] = "00";
            }
            time = arr[0]+":"+arr[1]+":"+arr[2];
        }
        else if (time.contains("PM")){
            time = time.replace("PM", " ");
            String arr[] = time.split(":");
            if (!arr[0].equals("12")){
                arr[0] = Integer.toString(Integer.parseInt(arr[0]) + 12);
            }
            time = arr[0] + ":" +arr[1]+ ":" + arr[2];
        }
        System.out.println(time);
    }
}
