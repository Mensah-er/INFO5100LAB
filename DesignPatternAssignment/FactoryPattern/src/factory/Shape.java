/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

/**
 * The Shape interface defines the contract for shape objects that can be drawn.
 * Any class implementing this interface must provide an implementation of the draw method.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public interface Shape {
    /**
     * Draws a shape. The specific implementation of this method will vary
     * depending on the type of shape (e.g., Circle, Rectangle, Square).
     * 
     * @return A string representation of the drawing action.
     */
    String draw();
}
