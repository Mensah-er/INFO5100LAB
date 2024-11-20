package MoonRover2;

/**
 * Represents the "At Rest" state of the rover.
 * Handles transitions based on pedal actions.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class AtRest extends State {

    /**
     * Constructor for the AtRest state.
     * Sets the state's name to "At Rest" and subState to null.
     */
    public AtRest() {
        this.name = "At Rest";
        this.subState = null;
    }

    /**
     * Handles the action of pressing the left pedal while in the AtRest state.
     * 
     * @param numPresses the number of times the left pedal is pressed
     * @return the next state of the rover
     */
    @Override
    public State pressLeftPedal(int numPresses) {
        if (numPresses == 1) {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return new MoveForward(); // Transition to MoveForward state
        }
        System.out.println("Invalid number of left pedal presses in At Rest state.");
        return this; // Remain in AtRest state
    }

    /**
     * Handles the action of pressing the right pedal while in the AtRest state.
     * 
     * @param numPresses the number of times the right pedal is pressed
     * @return the current state as pressing the right pedal is invalid in AtRest state
     */
    @Override
    public State pressRightPedal(int numPresses) {
        System.out.println("Error: Invalid action. Cannot press right pedal while at rest.");
        return this; // No state transition occurs
    }

    /**
     * Handles the action of pressing and holding the left pedal for a specific time.
     * If the pedal is pressed for more than 3 seconds, transitions to the MoveBackward state.
     * 
     * @param timeInSeconds the time in seconds the left pedal is pressed
     * @return the next state of the rover
     */
    @Override
    public State pressLeftPedalForTime(int timeInSeconds) {
        if (timeInSeconds > 3) {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return new MoveBackward(); // Transition to MoveBackward state
        }
        System.out.println("Error: Pressing left pedal for less than 3 seconds has no effect.");
        return this; // Remain in AtRest state
    }
}
