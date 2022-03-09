package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/*
    john tom
    john mary
    john tom
    mary anna
    mary anna
 */

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // HashSet
        HashSet<Map<String, String>> hs = new HashSet<Map<String, String>>();
        for (int i = 0; i < t; i++) {
            Map<String, String> m = new HashMap<String, String>();
            m.put(pair_left[i], pair_right[i]);
            hs.add(m);
            System.out.println(hs.size()); 
        }

        s.close();
    }
}
