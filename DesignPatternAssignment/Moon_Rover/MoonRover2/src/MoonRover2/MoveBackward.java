package MoonRover2;

/**
 * Represents the "Move Backward" state of the rover.
 * Handles transitions based on pedal actions while moving backward.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class MoveBackward extends State {

    /**
     * Constructor for the MoveBackward state.
     * Sets the state's name to "Move Backward" and the subState to "Accelerate".
     */
    public MoveBackward() {
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }

    /**
     * Handles the action of pressing the left pedal while in the MoveBackward state.
     * 
     * @param numPresses the number of times the left pedal is pressed
     * @return the current state, as pressing the left pedal has no effect in this state
     */
    @Override
    public State pressLeftPedal(int numPresses) {
        System.out.println("Error: Left pedal has no effect in Move Backward state.");
        return this; // No state transition occurs
    }

    /**
     * Handles the action of pressing the right pedal while in the MoveBackward state.
     * Transitions the rover based on the number of pedal presses.
     * 
     * @param numPresses the number of times the right pedal is pressed
     * @return the next state of the rover
     */
    @Override
    public State pressRightPedal(int numPresses) {
        switch (numPresses) {
            case 1:
                if ("Accelerate".equals(subState)) {
                    // Transition from Accelerate to Deaccelerate state
                    System.out.println("Transitioning from Accelerate State to Deaccelerate State...");
                    this.subState = "Deaccelerate";
                }
                break;
            case 3:
                if ("Deaccelerate".equals(subState)) {
                    // Transition from Deaccelerate to At Rest state
                    System.out.println("Transitioning from Deaccelerate State to At Rest State...");
                    return new AtRest();
                } else {
                    System.out.println("Error: Invalid substate for three presses.");
                }
                break;
            default:
                System.out.println("Error: Invalid number of right pedal presses.");
        }
        return this; // Return the current state if no valid transition occurs
    }

    /**
     * Handles the action of pressing and holding the left pedal for a specific time.
     * 
     * @param timeInSeconds the time in seconds the left pedal is pressed
     * @return the current state, as this action has no effect in MoveBackward state
     */
    @Override
    public State pressLeftPedalForTime(int timeInSeconds) {
        System.out.println("Error: Pressing left pedal for time has no effect in Move Backward state.");
        return this; // No state transition occurs
    }
}
