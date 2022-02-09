package Singleton;

public class Singleton {

    private static Singleton instance = null;
    public String str = "Hello I am a singleton! Let me say hello world to you";

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
