package MoonRover2;

/**
 * Represents the "Move Forward" state of the rover.
 * Handles transitions based on pedal actions while moving forward.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class MoveForward extends State {

    /**
     * Constructor for the MoveForward state.
     * Sets the state's name to "Move Forward" and the subState to "Accelerate".
     */
    public MoveForward() {
        this.name = "Move Forward";
        this.subState = "Accelerate";
    }

    /**
     * Handles the action of pressing the left pedal while in the MoveForward state.
     * 
     * @param numPresses the number of times the left pedal is pressed
     * @return the current state, as pressing the left pedal has no effect in this state
     */
    @Override
    public State pressLeftPedal(int numPresses) {
        System.out.println("Error: Left pedal has no effect in Move Forward state.");
        return this; // No state transition occurs
    }

    /**
     * Handles the action of pressing the right pedal while in the MoveForward state.
     * Transitions the rover based on the number of pedal presses and the current subState.
     * 
     * @param numPresses the number of times the right pedal is pressed
     * @return the next state or the current state if no valid transition occurs
     */
    @Override
    public State pressRightPedal(int numPresses) {
        switch (numPresses) {
            case 1:
                if ("Accelerate".equals(subState)) {
                    // Transition from Accelerate to Deaccelerate state
                    System.out.println("Transitioning from Accelerate State to Deaccelerate State...");
                    this.subState = "Deaccelerate";
                } else if ("Deaccelerate".equals(subState)) {
                    // Transition from Deaccelerate to Accelerate state
                    System.out.println("Transitioning from Deaccelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            case 3:
                if ("Deaccelerate".equals(subState)) {
                    // Transition from Deaccelerate to Constant Speed state
                    System.out.println("Transitioning from Deaccelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Error: Invalid substate for three presses.");
                }
                break;
            default:
                // Handle invalid number of right pedal presses
                System.out.println("Error: Invalid number of right pedal presses.");
        }
        return this; // Return the current state if no valid transition occurs
    }

    /**
     * Handles the action of pressing and holding the left pedal for a specific time.
     * 
     * @param timeInSeconds the time in seconds the left pedal is pressed
     * @return the current state, as this action has no effect in MoveForward state
     */
    @Override
    public State pressLeftPedalForTime(int timeInSeconds) {
        System.out.println("Error: Pressing left pedal for time has no effect in Move Forward state.");
        return this; // No state transition occurs
    }
}
