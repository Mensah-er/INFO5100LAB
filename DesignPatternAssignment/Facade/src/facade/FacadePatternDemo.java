/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Ernest Mensah
 */
public class FacadePatternDemo {
    
    public static void main (String[] args){
    ShapeMaker  shapeMaker= new ShapeMaker();
    
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
    }
    
}
