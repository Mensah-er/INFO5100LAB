package MoonRover2;

/**
 * Main class to simulate the operation of the rover through different states.
 * It demonstrates the behavior of the rover by simulating pedal presses and
 * printing the rover's state and substate at each step.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class RoverMain {
    public static void main(String[] args) {
        // Create a Rover object, which starts in the "At Rest" state with no substate
        Rover rover = new Rover();

        // Print the initial state and substate of the rover (should be "At Rest" and "None")
        rover.printStateAndSubState();

        // Simulate pressing the left pedal once (for accelerating forward)
        // This will transition the rover to the "Move Forward" state with the substate "Accelerate"
        rover.pressLeftPedal(1);  // Move to MoveForward state
        rover.printStateAndSubState();

        // Simulate pressing the right pedal once (to deaccelerate)
        // This will transition the rover to the "Deaccelerate" state
        rover.pressRightPedal(1);  // Transition to Deaccelerate state
        rover.printStateAndSubState();

        // Simulate pressing the right pedal three times (to achieve constant speed)
        // This will transition the rover to the "Constant Speed" state
        rover.pressRightPedal(3);  // Transition to Constant Speed state
        rover.printStateAndSubState();

        // Simulate pressing the left pedal for more than 3 seconds (to move backward)
        // This will transition the rover to the "Move Backward" state with the substate "Accelerate"
        rover.pressLeftPedalForTime(4);  // Transition to MoveBackward state
        rover.printStateAndSubState();

        // Simulate pressing the right pedal three times (to stop moving backward and return to rest)
        // This will transition the rover back to the "At Rest" state with no substate
        rover.pressRightPedal(3);  // Transition to At Rest state
        rover.printStateAndSubState();
    }
}
