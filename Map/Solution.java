package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        ArrayList<String> infos = new ArrayList<String>();
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                infos.add(s + "=" + map.get(s));
            } else {
                infos.add("Not found");
            }
        }
        for (String info : infos) {
            System.out.println(info);
        }
        in.close();
    }
}
