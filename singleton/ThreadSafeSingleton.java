/**
 * The basic implementation of singleton is not thread safe, 
 * if multiple threads are calling the getInstance method at the same time then
 * there two threads will create two objects of that class
 * 
 * So to make it thread safe we can mark the getInstance method as "synchronized"
 * which will allow only one thread to access the method at a time
 * 
 */
public class ThreadSafeSingleton{

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;

    }

}