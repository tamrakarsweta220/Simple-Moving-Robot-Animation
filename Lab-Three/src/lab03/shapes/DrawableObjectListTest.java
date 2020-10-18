package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class DrawableObjectListTest {
	private DrawableObjectList objList;
	private Drawable obj1;
	private Drawable obj2;
	private Drawable obj3;
	
	@Before
	public void setUp() throws Exception {
        /*
         * Construct all of the objects being used in the test fixture here.
         */
        objList = new DrawableObjectList();
        obj1 = new Circle(2,3,5,Color.red);
        obj2 = new Circle(2,3,5,Color.red);
        obj3 = new Circle(2,3,5,Color.red);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("wrong size", 0, objList.getSize());
	}
	
	@Test
	public void testAddObject() {
		objList.addDrawable(obj1);
		objList.addDrawable(obj2);
		objList.addDrawable(obj3);
		assertEquals("no object", 3, objList.getSize());
	}
	
	@Test
	public void testRemoveObject() {
		objList.addDrawable(obj1);
		objList.addDrawable(obj2);
		objList.addDrawable(obj3);
		objList.removeDrawable(obj2);
		assertEquals("wrong size", 2, objList.getSize());
	}

	@Test
	public void testRemoveObjectNull() {
		objList.removeDrawable(obj2);
		assertNotNull("the list is not null", objList.getSize());
	}
	
	@Test
	public void testScaleAll() {
		objList.addDrawable(obj1);
		Circle c1= (Circle) obj1;
		assertEquals("wrong size", 5, c1.getRadius());
		objList.scaleAll(1.5);
		assertEquals("wrong size", 8, c1.getRadius());
	}
}
