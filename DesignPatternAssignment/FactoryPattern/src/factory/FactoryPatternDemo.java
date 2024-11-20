/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 * The FactoryPatternDemo class demonstrates the usage of the ShapeFactory class. 
 * It creates different shape objects using the factory method and calls their draw methods.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class FactoryPatternDemo {
    /**
     * The main method serves as an entry point to demonstrate the creation and usage of shape objects.
     * It fetches different shapes using the ShapeFactory and calls the draw method of each shape.
     * 
     * @param arg Command line arguments (not used).
     */
    public static void main(String[] arg){
    ShapeFactory shapeFactory = new ShapeFactory();
    
    //get an object of Circle and call its draw metod.
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    
    //Call draw method of Circle
    shape1.draw();
    
    //get an object of Rectangle and call its draw
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    
   //Call draw method of Rectangle
    shape2.draw();
    
   //get an object of Rectangle and call its draw
    Shape shape3 = shapeFactory.getShape("SQUARE");
    
   //Call draw method of Square
    shape3.draw();
    }
    
}
