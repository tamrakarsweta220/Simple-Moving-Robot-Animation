package lab03.shapes;

/**
 * Create a rectangle object.
 * @author (Sweta and Elisa)
 * @version (09/30/19)
 */

import java.awt.Color;

/*
 * @author Sweta, Elise
 * @author Dickinson College
 * @version Oct 3, 2019
 */

import java.awt.Graphics;

public class Rectangle implements Drawable {

    private int x;
    private int y;
    private int length;
    private int breadth;
    private Color theColor;
    private boolean isVisible;

    /**
     * Construct a new Rectangle centered at initX, initY with a length of
     * initLength, breadth of initBreadth, and color indicated by initColor. 
     * The new Rectangle is visible by default.
     * 
     * @param initX the x coordinate of the center of the rectangle.
     * @param initY the y coordinate of the center of the rectangle.
     * @param initLength the length of the rectangle.
     * @param initBreadth the breadth of the rectangle.
     * @param initBreadth the breadth of the rectangle.
     * @param initColor the color of the rectangle.
     */
    public Rectangle(int initX, int initY, int initLength, int initBreadth, Color initColor) {
        x = initX;
        y = initY;
        length = initLength;
        breadth = initBreadth;
        theColor = initColor;
        isVisible = true;
    }

    /**
     * Get the x coordinate of the center of this rectangle.
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the center of this rectangle.
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Get the length of the rectangle.
     * 
     * @return the length
     */
    public int getLength() {
        return length;
    }
    
    /**
     * Get the breadth of the rectangle.
     * 
     * @return the breadth
     */
    public int getBreadth() {
        return breadth;
    }

    /**
     * Set the length of this rectangle. The rectangle's length is set to the absolute
     * value of the specified length to eliminate any negative length values.
     * 
     * @param newLength the length of the new rectangle.
     */
    public void setLength(int newLength) {
        length = Math.abs(newLength);
    }
    
    /**
     * Set the breadth of this rectangle. The rectangle's breadth is set to the absolute
     * value of the specified breadth to eliminate any negative breadth values.
     * 
     * @param newBreadth the breadth of the new rectangle.
     */
    public void setBreadth(int newBreadth) {
        breadth = Math.abs(newBreadth);
    }

    /**
     * Move the rectangle to a new location. This method changes the center point
     * of the rectangle using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Move the rectangle relative to its current location. The center of the
     * rectangle is moved by adding the parameters to the rectangle's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *            rectangle to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            rectangle down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    // === Implementation of the Drawable interface ===

    /**
     * Draw this DrawableSquare onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableSquare.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX() - length, getY() - length, 2 * length, 2 * breadth);
    }

    /**
     * Get the Color of this rectangle.
     * 
     * @return the color.
     */
    public Color getColor() {
        return theColor;
    }

    /**
     * Change the color of this rectangle to the newColor.
     * 
     * @param newColor the new rectangle.
     */
    public void setColor(Color newColor) {
        theColor = newColor;
    }

    /**
     * Set whether or not this rectangle will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this rectangle visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this rectangle is visible or not.
     * 
     * @return true if the rectangle is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
}
