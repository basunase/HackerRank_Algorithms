import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int T =  in.nextInt();
		int[] lengths = new int[T];
			for  (int j = 0; j < T; j++){
			lengths[j] =  in.nextInt();
		}
        Arrays.sort(lengths);
		
		int currStickSize=0;
		int sticks=lengths.length;
		for (int i : lengths) {
			if (i>currStickSize) {
				currStickSize=i;
				System.out.println(sticks);
			}
			sticks--;
		}
	}
}
