package lab03.shapes;

/**
 * Create a square object.
 * @author (Sweta and Elisa)
 * @version (09/30/19)
 */

import java.awt.Color;
import java.awt.Graphics;

public class Square implements Drawable, Scaleable {

    private int x;
    private int y;
    private int length;
    private Color theColor;
    private boolean isVisible;

    /**
     * Construct a new Square centered at initX, initY with a length of
     * initLength and color indicated by initColor. The new Square is visible by
     * default.
     * 
     * @param initX the x coordinate of the center of the square.
     * @param initY the y coordinate of the center of the square.
     * @param initLength the length of the square.
     * @param initBreadth the breadth of the square.
     * @param initColor the color of the square.
     */
    public Square(int initX, int initY, int initLength, Color initColor) {
        x = initX;
        y = initY;
        length = initLength;
        theColor = initColor;
        isVisible = true;
    }

    /**
     * Get the x coordinate of the center of this Square.
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the center of this Square.
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Get the length of the square.
     * 
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Set the length of this Square. The Square's length is set to the absolute
     * value of the specified length to eliminate any negative length values.
     * 
     * @param newLength the length of the new square.
     */
    public void setLength(int newLength) {
        length = Math.abs(newLength);
    }

    /**
     * Move the Square to a new location. This method changes the center point
     * of the Square using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Move the Square relative to its current location. The center of the
     * square is moved by adding the parameters to the Square's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *            Square to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            Square down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    
    // === Implementation of the Scaleable interface ===
    /**
     * Scale this Square by the specified factor. For example a factor of 2.0
     * will make the length twice as bit and a factor of 0.5 will make it half
     * as large. If the factor is negative the length is not changed.
     * 
     * @param factor the factor by which this Circle is to be scaled.
     */
    public void scale(double factor) {
        if (factor > 0) {
            length = (int) (length * factor);
        }
    }

    // === Implementation of the Drawable interface ===

    /**
     * Draw this DrawableSquare onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableSquare.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX() - length, getY() - length, 2 * length, 2 * length);
    }

    /**
     * Get the Color of this Square.
     * 
     * @return the color.
     */
    public Color getColor() {
        return theColor;
    }

    /**
     * Change the color of this Square to the newColor.
     * 
     * @param newColor the new color.
     */
    public void setColor(Color newColor) {
        theColor = newColor;
    }

    /**
     * Set whether or not this Square will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this Square visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this Square is visible or not.
     * 
     * @return true if the Square is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
}
