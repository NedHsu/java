package BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    /**
     * BitSet
     * 
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        /**
         * -- input --
         * 5 4
         * AND 1 2
         * SET 1 4
         * FLIP 2 2
         * OR 2 1
         * -- output --
         * 0 0
         * 1 0
         * 1 1
         * 1 2
         */
        /*
         * AND set set
         * OR set set
         * XOR set set
         * FLIP set index
         * SET set index
         */

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        BitSet b1 = new BitSet(m);
        BitSet b2 = new BitSet(m);
        BitSet[] bsArr = new BitSet[3];
        bsArr[1] = b1;
        bsArr[2] = b2;

        for (int i = 0; i < n; i++) {
            String op = in.next();
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            
            switch (op) {
                case "AND":
                    bsArr[num1].and(bsArr[num2]);
                    break;
                case "OR":
                    bsArr[num1].or(bsArr[num2]);
                    break;
                case "XOR":
                    bsArr[num1].xor(bsArr[num2]);
                    break;
                case "FLIP":
                    bsArr[num1].flip(num2);
                    break;
                case "SET":
                    bsArr[num1].set(num2);
                    break;
            }
            // After each operation, print the respective number of set bits in BitSet B1
            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }
        in.close();
    }
}
