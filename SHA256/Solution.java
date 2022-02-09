package SHA256;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (/*
                 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
                 * class should be named Solution.
                 */
        Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(SHA256.encrypt(s));
        }
    }
    
}

