/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 * The ShapeMaker class provides a simplified interface to draw various shapes 
 * without exposing the complexities of creating individual shape objects. 
 * It acts as a facade to the underlying shape objects (Circle, Rectangle, Square).
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class ShapeMaker {
    // Attributes for different shapes
    private Shape circle;
    private Shape rectangle;
    private Shape square;
     /**
     * Constructs a ShapeMaker object, initializing all the shape objects (Circle, Rectangle, Square).
     */
    public ShapeMaker (){
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
    }
      /**
     * Calls the draw method of the Circle object.
     * 
     * @return A string representing the action of drawing a circle.
     */
    public String drawCircle(){
       return circle.draw();
    }
    
     public String drawRectangle(){
      return rectangle.draw();
    }
    /**
     * Calls the draw method of the Rectangle object.
     * 
     * @return A string representing the action of drawing a rectangle.
     */
    public String drawSquare(){
    return square.draw();
    }  
}
