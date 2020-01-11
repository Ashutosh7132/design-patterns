/**
 * If we carefully check the ThreadSafeSingleton, 
 * synchronization is needed only till the object is created
 * once object is created then getInstance method can be allowed to acccess by 
 * multiple threads at a time
 * 
 * So we can make use of synchronized block to put lock only on the critical statement 
 * instead of whole method
 * 
 * This method is called as Double Checked Locking
 * 
 * 
 * Also to make it more thread safe:
 * we also make the instance variable as volatile
 * 
 * (volatile keyword here makes sure 
 * that the changes made in one thread are 
 * immediately reflect in other thread)
 * 
 */


public class BetterThreadSafeSingleton{
    
    private static volatile BetterThreadSafeSingleton instance;

    private BetterThreadSafeSingleton(){}

    public static BetterThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized(BetterThreadSafeSingleton.class){

                //we need to double check this as multiple threads can reach upto previous step
                if(instance == null){
                    instance = new BetterThreadSafeSingleton();
                }
                
            }
        }
        return instance;
    }
}