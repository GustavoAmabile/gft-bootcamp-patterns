package one.dio.gangoffour.singleton;

/**
 * Singleton
 * */

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        super();
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
