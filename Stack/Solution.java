package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * String input=sc.next();
 * while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}",
 * "")).length());
 * System.out.println(input.isEmpty());
 */

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            Stack<Character> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (stacky.peek() == '{') {
                                stacky.pop();
                            }
                            break;
                        case ']':
                            if (stacky.peek() == '[') {
                                stacky.pop();
                            }
                            break;
                        case ')':
                            if (stacky.peek() == '(') {
                                stacky.pop();
                            }
                            break;
                        default:
                            stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }
        sc.close();
    }
}
