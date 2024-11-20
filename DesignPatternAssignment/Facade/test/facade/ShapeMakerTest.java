/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the ShapeMaker class.
 * This class tests the methods in the ShapeMaker class, ensuring that they correctly
 * call the draw method of the respective shape objects.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();
        
        //positive test cases
        assertEquals(expResult, result);
        assertEquals("Circle::draw()", instance.drawCircle());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Negative test cases
        assertNotEquals("Not Circle", result);
        assertEquals("Circle::draw()", instance.drawCircle());
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();
        
       //positive test cases
        assertEquals(expResult, result);
        assertEquals("Rectangle::draw()", instance.drawRectangle());
        
       //Negative test cases
        assertNotEquals("Not Rectangle", result);
        assertEquals("Rectangle::draw()", instance.drawRectangle());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Square::draw()";
        String result = instance.drawSquare();
        
         //positive test cases
        assertEquals(expResult, result);
        assertEquals("Square::draw()", instance.drawSquare());
        
        //Negative test cases
        assertNotEquals("Not Square", result);
        assertEquals("Square::draw()", instance.drawSquare());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
