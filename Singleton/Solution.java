package Singleton;

public class Solution {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();
        System.out.println(s1 == s2);
    }
}
