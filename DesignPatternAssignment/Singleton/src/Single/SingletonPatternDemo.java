// SingletonPatternDemo.java
package Single;

/**
 * The SingletonPatternDemo class demonstrates the use of the Singleton pattern.
 * It shows how to get the only instance of the SingleObject class and call its method.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class SingletonPatternDemo {
    /**
     * The main method demonstrates the Singleton pattern.
     * It retrieves the Singleton object and calls the showMessage method to display the message.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        //Illegal construct
        //Compile Time Error: the constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        
        // Get the only instance of SingleObject
        SingleObject object = SingleObject.getInstance();
        
        // Show the message
        object.showMessage();
    }
}
