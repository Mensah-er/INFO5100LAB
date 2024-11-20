/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
/**
 * This class represents a Circle shape. It implements the Shape interface
 * and provides the specific implementation of the draw method for a circle.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class Circle implements Shape{
    /**
     * Draws a Circle by printing "Inside Circle:: Draw() method." to the console.
     * 
     * @return A string representing the action of drawing a circle.
     */
    @Override
    public String draw(){
    System.out.println("Inside Circle:: Draw() method.");
    return ("Inside Circle:: Draw() method.");
                       }
}
