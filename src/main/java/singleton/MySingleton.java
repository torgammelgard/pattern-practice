package singleton;

public class MySingleton {

    //private static MySingleton ourInstance = new MySingleton();
    private static MySingleton ourInstance;
    private static long numCreations = 0;

    private MySingleton() {
        numCreations++;
    }

    public static MySingleton getInstance() {
        synchronized (MySingleton.class) {
            if (ourInstance == null)
                ourInstance = new MySingleton();
            return ourInstance;
        }
    }

    public static synchronized long getNumCreations() {
        return numCreations;
    }
}
