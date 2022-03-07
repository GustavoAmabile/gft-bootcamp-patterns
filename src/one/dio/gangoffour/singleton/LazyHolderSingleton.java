package one.dio.gangoffour.singleton;

public class LazyHolderSingleton {


    private static class InstanceHolder {
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }
    private LazyHolderSingleton(){
        super();
    }

    public static LazyHolderSingleton getInstance(){
        return InstanceHolder.instance;
    }
}
