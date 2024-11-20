package MoonRover2;

/**
 * Unit test class for testing the functionality of the Rover class.
 * Contains various test cases to check rover state transitions and behavior.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class RoverTest {

    /**
     * Test of getCurrentStateName method, of class Rover.
     * This test checks that the initial state of the rover is "At Rest".
     */
    @Test
    public void testGetCurrentStateName() {
        System.out.println("Testing getCurrentStateName...");
        Rover instance = new Rover(); // Create a new rover instance
        String expResult = "At Rest"; // Expected initial state
        String result = instance.getCurrentStateName(); // Get the current state name
        assertEquals(expResult, result); // Assert that the expected state matches the result
    }

    /**
     * Test of getCurrentSubState method, of class Rover.
     * This test checks that the initial substate of the rover is "None".
     */
    @Test
    public void testGetCurrentSubState() {
        System.out.println("Testing getCurrentSubState...");
        Rover instance = new Rover(); // Create a new rover instance
        String expResult = "None"; // Expected initial substate
        String result = instance.getCurrentSubState(); // Get the current substate
        assertEquals(expResult, result); // Assert that the expected substate matches the result
    }

    /**
     * Test of pressLeftPedal method, of class Rover.
     * This test checks the transition from "At Rest" to "Move Forward" when the left pedal is pressed.
     */
    @Test
    public void testPressLeftPedal() {
        System.out.println("Testing pressLeftPedal...");
        Rover instance = new Rover(); // Create a new rover instance
        instance.pressLeftPedal(1); // Press the left pedal (valid transition)
        assertEquals("Move Forward", instance.getCurrentStateName()); // Assert that the state is now "Move Forward"
        assertEquals("Accelerate", instance.getCurrentSubState()); // Assert that the substate is "Accelerate"
    }

    /**
     * Test of pressRightPedal method, of class Rover.
     * This test checks the transitions in the "Move Forward" state when the right pedal is pressed.
     */
    @Test
    public void testPressRightPedal() {
        System.out.println("Testing pressRightPedal...");
        Rover instance = new Rover(); // Create a new rover instance
        instance.pressLeftPedal(1); // Move to "Move Forward" state
        instance.pressRightPedal(1); // Transition to "Deaccelerate" substate
        assertEquals("Move Forward", instance.getCurrentStateName()); // Assert state remains "Move Forward"
        assertEquals("Deaccelerate", instance.getCurrentSubState()); // Assert substate is now "Deaccelerate"

        instance.pressRightPedal(3); // Transition to "Constant Speed"
        assertEquals("Move Forward", instance.getCurrentStateName()); // Assert state remains "Move Forward"
        assertEquals("Constant Speed", instance.getCurrentSubState()); // Assert substate is "Constant Speed"
    }

    /**
     * Test of pressLeftPedalForTime method, of class Rover.
     * This test checks the transition from "At Rest" to "Move Backward" when the left pedal is pressed for more than 3 seconds.
     */
    @Test
    public void testPressLeftPedalForTime() {
        System.out.println("Testing pressLeftPedalForTime...");
        Rover instance = new Rover(); // Create a new rover instance
        instance.pressLeftPedalForTime(4); // Press the left pedal for 4 seconds (valid transition)
        assertEquals("Move Backward", instance.getCurrentStateName()); // Assert the state is "Move Backward"
        assertEquals("Accelerate", instance.getCurrentSubState()); // Assert substate is "Accelerate"
    }

    /**
     * Test of printStateAndSubState method, of class Rover.
     * This test ensures that the method does not throw exceptions and correctly prints the state and substate.
     */
    @Test
    public void testPrintStateAndSubState() {
        System.out.println("Testing printStateAndSubState...");
        Rover instance = new Rover(); // Create a new rover instance
        instance.printStateAndSubState(); // Call the print method to check if it prints without errors
    }
}
