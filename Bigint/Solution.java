package Bigint;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        BigInteger ai = new BigInteger(a);
        BigInteger bi = new BigInteger(b);

        System.out.println(ai.add(bi));
        System.out.println(ai.multiply(bi));

        sc.close();
    }
}