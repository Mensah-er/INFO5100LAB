/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package factory;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit tests for the ShapeFactory class.
 * This class tests the getShape method to ensure that the correct shape object is returned.
 * 
 * @author Ernest Mensah
 * @version 1.0
 */
public class ShapeFactoryTest {
     /**
     * Test case for getting a Circle shape using the ShapeFactory.
     * Verifies that the draw method of the Circle returns the correct string.
     */
    @Test
    public void testGetShapeWithCircle() {
        System.out.println("Testing getShape with 'CIRCLE'");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");

        // Verify the returned object is not null
        assertNotNull(shape);

        // Verify the draw method
        String result = shape.draw();
        assertEquals("Inside Circle:: Draw() method.", result);
    }

    /**
     * Test case for getting a Rectangle shape using the ShapeFactory.
     * Verifies that the draw method of the Rectangle returns the correct string.
     */
    @Test
    public void testGetShapeWithRectangle() {
        System.out.println("Testing getShape with 'RECTANGLE'");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");

        // Verify the returned object is not null
        assertNotNull(shape);

        // Verify the draw method
        String result = shape.draw();
        assertEquals("Inside Rectangle:: Draw() method.", result);
    }
    /**
     * Test case for getting a Square shape using the ShapeFactory.
     * Verifies that the draw method of the Square returns the correct string.
     */
    @Test
    public void testGetShapeWithSquare() {
        System.out.println("Testing getShape with 'SQUARE'");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");

        // Verify the returned object is not null
        assertNotNull(shape);

        // Verify the draw method
        String result = shape.draw();
        assertEquals("Inside Square:: Draw() method.", result);
    }
    /**
     * Test case for getting a shape with an invalid input (e.g., "TRIANGLE").
     * Verifies that the returned shape is null.
     */
    @Test
    public void testGetShapeWithInvalidInput() {
        System.out.println("Testing getShape with an invalid shape");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("TRIANGLE");

        // Verify the returned object is null
        assertNull(shape);
    }
      /**
     * Test case for getting a shape with an empty string input.
     * Verifies that the returned shape is null.
     */
    @Test
    public void testGetShapeWithEmptyString() {
        System.out.println("Testing getShape with an empty string");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("");

        // Verify the returned object is null
        assertNull(shape);
    }
      /**
     * Test case for getting a shape with a null input.
     * Verifies that the returned shape is null.
     */
    @Test
    public void testGetShapeWithNull() {
        System.out.println("Testing getShape with null");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(null);

        // Verify the returned object is null
        assertNull(shape);
    }
}