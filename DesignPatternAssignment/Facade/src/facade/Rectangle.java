/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;


/**
 * This class represents a Rectangle shape. It implements the Shape interface
 * and provides the specific implementation of the draw method for a rectangle.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class Rectangle implements Shape{
      /**
     * Draws a Rectangle by printing "Rectangle::draw()" to the console.
     * 
     * @return A string representing the action of drawing a rectangle.
     */
    @Override
    public String draw() {
    System.out.println("Rectangle::draw()");
    return ("Rectangle::draw()");
    }
}
