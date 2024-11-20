// SingleObject.java
package Single;

/**
 * SingleObject class demonstrates the Singleton Design Pattern.
 * This pattern ensures that only one instance of the class is created and provides
 * a global point of access to that instance.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class SingleObject {
   /**
     * The single instance of the SingleObject class. It is created eagerly
     * when the class is loaded.
     */
    
    private static SingleObject instance = new SingleObject();
    /**
     * Private constructor to prevent instantiation from other classes.
     * This ensures that the class can only be instantiated once.
     */
    
    private SingleObject() {}
    
   /**
     * Provides access to the single instance of SingleObject.
     * If the instance has already been created, it returns the existing instance.
     * Otherwise, it creates and returns the instance.
     * 
     * @return The single instance of the SingleObject class.
     */
    public static SingleObject getInstance() {
        /**
     * Displays a message to demonstrate the behavior of the Singleton object.
     * This is a simple method to show that the Singleton object is functional.
     */
        return instance;
    }
    
    // Sample method to demonstrate behavior of the Singleton object
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
