package getSmallestAndLargest;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++)
        {
            String sub = s.substring(i, i + k);
            if (smallest.length() == 0)
            {
                smallest = sub;
            }
            else if (sub.compareTo(smallest) < 0)
            {
                smallest = sub;
            }
            if (largest.length() == 0)
            {
                largest = sub;
            }
            else if (sub.compareTo(largest) > 0)
            {
                largest = sub;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}