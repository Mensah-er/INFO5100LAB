package MoonRover2;

/**
 * Abstract class representing the state of the rover.
 * Each state will define its own behavior when interacting with the pedals.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public abstract class State {
    // Name of the current state (e.g., "At Rest", "Move Forward", etc.)
    protected String name;

    // Current substate of the rover (e.g., "Accelerate", "Deaccelerate", etc.)
    protected String subState;

    // Getter method to retrieve the name of the current state
    public String getName() {
        return name;
    }

    // Getter method to retrieve the current substate or return "None" if no substate exists
    public String getSubState() {
        return subState != null ? subState : "None";
    }

    // Abstract method to handle pressing the left pedal, to be implemented by concrete state classes
    public abstract State pressLeftPedal(int numPresses);

    // Abstract method to handle pressing the right pedal, to be implemented by concrete state classes
    public abstract State pressRightPedal(int numPresses);

    // Abstract method to handle pressing the left pedal for a given time, to be implemented by concrete state classes
    public abstract State pressLeftPedalForTime(int timeInSeconds);
}
