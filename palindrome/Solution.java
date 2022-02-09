package palindrome;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Print Yes if it is a palindrome, print No otherwise. */
        System.out.println(isPalindrome(A) ? "Yes" : "No");
        sc.close();
    }

    public static boolean isPalindrome(String A) {
        int i = 0, j = A.length() - 1;
        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
