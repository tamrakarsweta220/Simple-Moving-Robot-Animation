package lab03.shapes;

import static org.junit.Assert.*;
import org.junit.*; 

import java.awt.*;

public class RectangleTest {

    private Rectangle r1;
    
    @Before
    public void setUp() throws Exception {
        r1 = new Rectangle(10,20,5,3,Color.red);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 10, r1.getX());
        assertEquals("wrong y", 20, r1.getY());
        assertEquals("wrong radius", 5, r1.getLength());
        assertEquals("wrong color", Color.red, r1.getColor());
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test
    public void testSetColor() {
    	r1.setColor(Color.blue);
        assertEquals("wrong color", Color.blue, r1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
    	r1.setVisible(false);
        assertFalse("should be invisible", r1.isVisible());
        
        r1.setVisible(true);
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test 
    public void testSetLength() {
    	r1.setLength(10);
        assertEquals("wrong length", 10, r1.getLength());
        
        r1.setLength(-20);
        assertEquals("wrong length", 20, r1.getLength());
    }
    
    @Test 
    public void testSetBreadth() {
    	r1.setBreadth(10);
        assertEquals("wrong length", 10, r1.getBreadth());
        
        r1.setBreadth(-15);
        assertEquals("wrong length", 15, r1.getBreadth());
    }
    
    @Test
    public void testMove() {
    	r1.move(20,30);
        assertEquals("wrong x", 20, r1.getX());
        assertEquals("wrong y", 30, r1.getY());
    }
    
    @Test
    public void testTranslate() {
    	r1.translate(5,10);
        assertEquals("wrong x", 15, r1.getX());
        assertEquals("wrong y", 30, r1.getY());
    }
    
}

