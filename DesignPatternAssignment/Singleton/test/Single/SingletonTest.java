package Single;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit tests for the SingleObject class to validate the Singleton pattern.
 * The tests ensure that only one instance of SingleObject is created,
 * and that the showMessage method works as expected.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class SingletonTest {
// Declare two instance variables to hold the Singleton instances for testing
    private SingleObject instance1;
    private SingleObject instance2;

    public SingletonTest() {
    }

    @Before
    public void setUp() {
        // Create two instances of SingleObject
        instance1 = SingleObject.getInstance();
        instance2 = SingleObject.getInstance();
    }

    @After
    public void tearDown() {
        // Clean up resources, if needed (none in this case)
    }
 /**
     * Test the Singleton pattern to ensure only one instance is created.
     * This verifies that both instance1 and instance2 point to the same object.
     */
    @Test
    public void testSingletonInstance() {
        // Test that both instances are the same object
        assertSame("Both instances should be the same object", instance1, instance2);
    }

   /**
     * Test the showMessage method of SingleObject.
     * This method captures the console output and verifies that the output is as expected.
     */
    @Test
    public void testShowMessage() {
        // Redirect System.out to capture the print output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        // Invoke showMessage method
        instance1.showMessage();
        
        // Test that the output is as expected
        assertEquals("Hello World!\n", outContent.toString());
    }

    /**
     * Test to verify that only one instance is created even when getInstance is called multiple times.
     */
    @Test
    public void testMultipleInstanceCalls() {
        SingleObject instance3 = SingleObject.getInstance();
        assertSame("Instance3 should be the same as instance1 and instance2", instance1, instance3);
    }
}
