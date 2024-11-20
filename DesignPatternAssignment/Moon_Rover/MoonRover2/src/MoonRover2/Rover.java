package MoonRover2;

/**
 * Represents the Rover, which has a state and substate.
 * The rover can transition between different states based on pedal presses.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class Rover {
    // Variables to track the current state and substate of the rover
    private String currentStateName;
    private String currentSubState;

    /**
     * Constructor for the Rover class.
     * Initializes the rover to the "At Rest" state with no substate.
     */
    public Rover() {
        this.currentStateName = "At Rest"; // Initial state is "At Rest"
        this.currentSubState = "None"; // Initial substate is "None"
    }

    /**
     * Getter method to return the current state name.
     * 
     * @return the current state name
     */
    public String getCurrentStateName() {
        return currentStateName;
    }

    /**
     * Getter method to return the current substate.
     * 
     * @return the current substate
     */
    public String getCurrentSubState() {
        return currentSubState;
    }

    /**
     * Simulates pressing the left pedal. The behavior depends on the current state of the rover.
     * In the "At Rest" state, pressing the left pedal once transitions the rover to the "Move Forward" state.
     * 
     * @param numPresses the number of times the left pedal is pressed
     */
    public void pressLeftPedal(int numPresses) {
        if (currentStateName.equals("At Rest") && numPresses == 1) {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            currentStateName = "Move Forward"; // Transition to Move Forward state
            currentSubState = "Accelerate";   // Set substate to Accelerate
        } else {
            System.out.println("Error: Invalid transition from At Rest.");
        }
    }

    /**
     * Simulates pressing the right pedal. The behavior depends on the current state and substate.
     * In the "Move Forward" state, pressing the right pedal once will transition from "Accelerate" to "Deaccelerate".
     * Pressing the right pedal three times will transition to "Constant Speed".
     * In the "Move Backward" state, pressing the right pedal three times will stop the rover and return it to the "At Rest" state.
     * 
     * @param numPresses the number of times the right pedal is pressed
     */
    public void pressRightPedal(int numPresses) {
        switch (currentStateName) {
            case "Move Forward":
                if (numPresses == 1 && currentSubState.equals("Accelerate")) {
                    // Transition from Accelerate to Deaccelerate state
                    System.out.println("Transitioning from Accelerate State to Deaccelerate State...");
                    currentSubState = "Deaccelerate";
                } else if (numPresses == 3 && currentSubState.equals("Deaccelerate")) {
                    // Transition from Deaccelerate to Constant Speed state
                    System.out.println("Transitioning from Deaccelerate State to Constant Speed State...");
                    currentSubState = "Constant Speed";
                } else {
                    // Handle invalid right pedal press for the current substate
                    System.out.println("Error: Invalid substate for right pedal presses.");
                }
                break;

            case "Move Backward":
                if (numPresses == 3 && currentSubState.equals("Deaccelerate")) {
                    // Transition from Deaccelerate to At Rest state
                    System.out.println("Transitioning from Deaccelerate State to At Rest State...");
                    currentStateName = "At Rest";  // Transition to At Rest state
                    currentSubState = "None";      // Reset substate to None
                } else {
                    // Handle invalid right pedal press in Move Backward state
                    System.out.println("Error: Invalid substate for right pedal presses.");
                }
                break;

            default:
                // Handle invalid right pedal press in any other state
                System.out.println("Error: Right pedal press not valid in current state.");
        }
    }

    /**
     * Simulates holding the left pedal for a certain number of seconds.
     * If held for more than 3 seconds in the "At Rest" state, transitions to the "Move Backward" state.
     * 
     * @param secondsHeld the number of seconds the left pedal is held down
     */
    public void pressLeftPedalForTime(int secondsHeld) {
        if (currentStateName.equals("At Rest") && secondsHeld > 3) {
            // Transition to Move Backward state if the left pedal is held for more than 3 seconds
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            currentStateName = "Move Backward"; // Transition to Move Backward state
            currentSubState = "Accelerate";     // Set substate to Accelerate
        } else {
            // Handle invalid left pedal hold in At Rest state
            System.out.println("Error: Left pedal hold not valid in current state.");
        }
    }

    /**
     * Prints the current state and substate of the rover.
     */
    public void printStateAndSubState() {
        System.out.println("Current State: " + currentStateName);  // Print current state
        System.out.println("Current SubState: " + currentSubState); // Print current substate
    }
}
