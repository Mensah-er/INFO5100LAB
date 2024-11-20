/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 * The ShapeFactory class provides a method to create different types of shape objects 
 * (Circle, Rectangle, Square) based on the input provided. It acts as a Factory 
 * in the Factory Design Pattern.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */

public class ShapeFactory {
    
/**
     * Returns an object of the specified shape type. 
     * It creates and returns an instance of Circle, Rectangle, or Square based on the shapeType argument.
     * If the shapeType is invalid or empty, it returns null.
     * 
     * @param shapeType The type of shape to create. Possible values: "CIRCLE", "RECTANGLE", "SQUARE".
     * @return A Shape object based on the shapeType, or null if the shapeType is invalid or empty.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
//public class ShapeFactory {
//    //use getShape method to get object of the type Shape
//    public Shape getShape(String shapeType){
//        if (shapeType == null){
//        return null;
//        }
//        if (shapeType.equalsIgnoreCase("CIRCLE")){
//        return new Circle();
//        }
//        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
//        return new Rectangle();
//        }
//        else if (shapeType.equalsIgnoreCase("SQUARE")){
//        return new Square();
//        }
//        return null;
//    }
//    
//}
