package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
-- input --
5
12 0 1 78 12
2
Insert
5 23
Delete
0

-- output --
0 1 78 12 23
*/

public class Solution {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            list.add(d + "");
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            if (s.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y + "");
            } else if (s.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        System.out.println(String.join(" ", list));
        sc.close();
    }
}
