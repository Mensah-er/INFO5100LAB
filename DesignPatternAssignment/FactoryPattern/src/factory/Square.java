/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 * This class represents a Square shape. It implements the Shape interface
 * and provides the specific implementation of the draw method for a square.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class Square implements Shape{
    /**
     * Draws a Square by printing "Inside Square:: Draw() method." to the console.
     * 
     * @return A string representing the action of drawing a square.
     */
    @Override
    public String draw(){
    System.out.println("Inside Square:: Draw() method.");
    return ("Inside Square:: Draw() method.");
                       }
    
}
