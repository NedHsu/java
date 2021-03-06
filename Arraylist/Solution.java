package Arraylist;

import java.io.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            
            rows.add(row);
        }
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
