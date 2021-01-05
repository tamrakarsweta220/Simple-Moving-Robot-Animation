package lab03.shapes;

import java.awt.*;

/**
 * Sample program that draws a multicolored robot at the center of the
 * window.
 *
 * @author Sweta, Elise
 * @author Dickinson College
 * @version Oct 3, 2019
 */
public class Robot {

    /**
     * Draw a multicolored robot at the center of the window.
     * 
     * @param args none
     */
    public static void main(String[] args) {
        DrawableObjectList objList = new DrawableObjectList();
        DrawingTablet tablet = new DrawingTablet("Robot", 800, 800, objList);

        Square s1 = new Square(400, 200, 100, Color.gray);
        objList.addDrawable(s1);
        
        Rectangle r1 = new Rectangle(400, 400, 140, 100, Color.black);
        objList.addDrawable(r1);
        
        Rectangle r12 = new Rectangle(400, 600, 140, 100, Color.gray);
        objList.addDrawable(r12);
        
        Square s2 = new Square(330, 700, 60, Color.lightGray);
        objList.addDrawable(s2);
        
        Square s3 = new Square(470, 700, 60, Color.lightGray);
        objList.addDrawable(s3);
        
        Rectangle r2 = new Rectangle(250, 380, 60, 30, Color.lightGray);
        objList.addDrawable(r2);
        
        Rectangle r3 = new Rectangle(550, 380, 60, 30, Color.lightGray);
        objList.addDrawable(r3);
        
        Circle c1 = new Circle(350, 150, 25, Color.white);
        objList.addDrawable(c1);
        
        Circle c2 = new Circle(450, 150, 25, Color.white);
        objList.addDrawable(c2);
        
        Rectangle r4 = new Rectangle(400, 230, 40, 20, Color.white);
        objList.addDrawable(r4);

        Rectangle r5 = new Rectangle(350, 75, 10, 20, Color.lightGray);
        objList.addDrawable(r5);

        Rectangle r6 = new Rectangle(450, 75, 10, 20, Color.lightGray);
        objList.addDrawable(r6);
        
        Circle c3 = new Circle(350, 70, 15, Color.lightGray);
        objList.addDrawable(c3);
        
        Circle c4 = new Circle(450, 70, 15, Color.lightGray);
        objList.addDrawable(c4);
        
        tablet.repaint();
        
        AnimationTimer.sleep(1000);
        c3.setColor(Color.yellow);
        c4.setColor(Color.yellow);
        
        tablet.repaint();
        
        AnimationTimer.sleep(1000);
//        c3.scale(1.5);
//        c4.scale(1.5);
        c3.move(350, 60);
        c4.move(450, 60);
        
        tablet.repaint();
        
        AnimationTimer.sleep(2000);
        
        tablet.repaint();
        
        for(int i = 0; i<6; i++) {
//          s1.translate(50,0);
//          s2.translate(50,0);
//          s3.translate(50,0);
//          r1.translate(50,0);
//          r2.translate(50,0);
//          r3.translate(50,0);
//          r4.translate(50,0);
//          r5.translate(50,0);
//          r6.translate(50,0);
//          c1.translate(50,0);
//          c2.translate(50,0);
//          c3.translate(50,0);
//          c4.translate(50,0);
          if(i%2 == 0) {
//          	c3.scale(2);
//          	c4.scale(2);
          	c3.setColor(Color.yellow);
          	c4.setColor(Color.yellow);
          	r2.translate(0,40);
          	r3.translate(0,40);
          }
          else {
//          	c3.scale(0.5);
//          	c4.scale(0.5);
          	c3.setColor(Color.white);
              c4.setColor(Color.white);
              r2.translate(0,-40);
          	r3.translate(0,-40);
          }
          AnimationTimer.sleep(800);
          
          tablet.repaint();
          }
        
        for(int i = 0; i<4; i++) {
        s1.translate(50,0);
        s2.translate(50,0);
        s3.translate(50,0);
        r1.translate(50,0);
        r12.translate(50,0);
        r2.translate(50,0);
        r3.translate(50,0);
        r4.translate(50,0);
        r5.translate(50,0);
        r6.translate(50,0);
        c1.translate(50,0);
        c2.translate(50,0);
        c3.translate(50,0);
        c4.translate(50,0);
        if(i%2 == 0) {
        	c3.scale(2);
        	c4.scale(2);
        	c3.setColor(Color.yellow);
        	c4.setColor(Color.yellow);
        }
        else {
        	c3.scale(0.5);
        	c4.scale(0.5);
        	c3.setColor(Color.white);
            c4.setColor(Color.white);
        }
        AnimationTimer.sleep(800);
        
        tablet.repaint();
        }
        
        AnimationTimer.sleep(800);
        tablet.repaint();
        
        for(int i = 0; i<6; i++) {
        s1.translate(-50,0);
        s2.translate(-50,0);
        s3.translate(-50,0);
        r1.translate(-50,0);
        r12.translate(-50,0);
        r2.translate(-50,0);
        r3.translate(-50,0);
        r4.translate(-50,0);
        r5.translate(-50,0);
        r6.translate(-50,0);
        c1.translate(-50,0);
        c2.translate(-50,0);
        c3.translate(-50,0);
        c4.translate(-50,0);
        if(i%2 == 0) {
        	c3.scale(2);
        	c4.scale(2);
        	c3.setColor(Color.yellow);
        	c4.setColor(Color.yellow);
        }
        else {
        	c3.scale(0.5);
        	c4.scale(0.5);
        	c3.setColor(Color.white);
            c4.setColor(Color.white);
        }
        AnimationTimer.sleep(800);
        
        tablet.repaint();
        }
            
            AnimationTimer.sleep(800);
            tablet.repaint();
            
            for(int i = 0; i<6; i++) {
//            s1.translate(-50,0);
//            s2.translate(-50,0);
//            s3.translate(-50,0);
//            r1.translate(-50,0);
//            r2.translate(-50,0);
//            r3.translate(-50,0);
//            r4.translate(-50,0);
//            r5.translate(-50,0);
//            r6.translate(-50,0);
//            c1.translate(-50,0);
//            c2.translate(-50,0);
//            c3.translate(-50,0);
//            c4.translate(-50,0);
            if(i%2 == 0) {
            	c3.scale(2);
            	c4.scale(2);
            	c3.setColor(Color.yellow);
            	c4.setColor(Color.yellow);
            }
            else {
            	c3.scale(0.5);
            	c4.scale(0.5);
            	c3.setColor(Color.white);
                c4.setColor(Color.white);
            }
            AnimationTimer.sleep(800);
            
            tablet.repaint();
            }
        tablet.repaint();
    }
}
