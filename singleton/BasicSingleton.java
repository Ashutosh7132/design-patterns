/**
 * A Class is singleton if a single object of that class can be created
 * 
 * To make a class singleton:
 *  - make the constructor private (so that nobody can create the object of class)
 *  - expose a static method to provide the instance of the class
 *      Note: because the constructor is private nobody will have the object to call the exposed method 
 *            if it is not static
 *  - because the method is static so it can not acccess the non static class variables for 
 *    so object defined as class variable should also be static
 *  
 * 
 * Problems with this approach
 *  - It's not threadsafe
 *  - Singleton property of the class can be breaked using reflection API's
 * 
 */
public class BasicSingleton{

    private static BasicSingleton instance;

    private BasicSingleton(){}

    public static BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        return instance;

    }


}