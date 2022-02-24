package SubArray;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int[] b = new int[l];
        for (int i = 0; i < l; i++)
            b[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < b.length; j++) {
                sum += b[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}