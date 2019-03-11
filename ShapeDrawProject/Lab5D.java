
package lab_5d;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Lab5D extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public Lab5D() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Circle");
        choices.add("Rectangle");
        choices.add("Triangle");
        
        /* Create Shapes */
        
        /*shapes.add(new Rectangle(100, 100, 0, 100, 100));
        shapes.add(new Circle(400, 100, 1, 50));
        shapes.add(new Triangle(250, 350, 2, 100, 100));
        */
        
        for(int i = 0; i < 30; ++i){
            
            int pick = (int)(Math.random() * 3);
            String s = choices.get(pick);
            
            if(s == "Circle"){
                int newX = (int)(Math.random() * 500);
                int newY = (int)(Math.random() * 500);
                int newZ = (int)(Math.random() * MAX_LAYER);
                int newRadius = (int)(Math.random() * 90 + 10);
                        
                Circle c = new Circle(newX, newY,newZ,newRadius);
                
                shapes.add(c);   
            }
            
            else if(s == "Rectangle"){
                int newX = (int)(Math.random() * 500);
                int newY = (int)(Math.random() * 500);
                int newZ = (int)(Math.random() * MAX_LAYER);
                int newLength = (int)(Math.random() * 90 + 10);
                int newWidth = (int)(Math.random() * 90 + 10);
                
                Rectangle r = new Rectangle(newX,newY,newZ,newLength,newWidth);
                
                shapes.add(r);
            }
            
            else if(s == "Triangle"){
                int newX = (int)(Math.random() * 500);
                int newY = (int)(Math.random() * 500);
                int newZ = (int)(Math.random() * MAX_LAYER);
                int newBase = (int)(Math.random() * 90 + 10);
                int newHeigth = (int)(Math.random() * 90 + 10);
                
                Triangle t = new Triangle(newX,newY,newZ,newBase,newHeigth);
                
                shapes.add(t);
            }
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        
                        Rectangle r = (Rectangle) s;
                        
                        g.drawRect((int)(r.getX() - r.getWidth() / 2),
                                (int)(r.getY() - r.getLength() / 2),
                                (int)r.getWidth(), (int)r.getLength());
                        
                        g.fillRect((int)(r.getX() - r.getWidth() / 2),
                                (int)(r.getY() - r.getLength() / 2),
                                (int)r.getWidth(), (int)r.getLength());

                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        Circle c = (Circle) s;
                        int x1 = (int)(c.getX() - c.getRadius());
                        int y1 = (int)(c.getY() - c.getRadius());
                           
                        
                        g.drawOval(x1, y1, (int)c.getDiameter(),
                                (int)c.getDiameter());
                        g.fillOval(x1, y1, (int)c.getDiameter(),
                                (int)c.getDiameter());

                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        
                        Triangle t = (Triangle) s;
                        
                        int x1 = t.getX();
                        int x2 = (int)(t.getX() - (t.getBase() / 2));
                        int x3 = (int)(t.getX() + (t.getBase() / 2));
                        int [] xValues = new int [3];
                        xValues[0] = x1;
                        xValues[1] = x2;
                        xValues[2] = x3;
                        
                        int y1 = (int)(t.getY() - (t.getHeight() / 2));
                        int y2 = (int)(t.getY() + (t.getHeight() / 2));
                        int y3 = (int)(t.getY() + (t.getHeight() / 2));
                        int [] yValues = new int [3];
                        yValues[0] = y1;
                        yValues[1] = y2;
                        yValues[2] = y3;
                        
                        g.drawPolygon(xValues, yValues, 3);
                        g.fillPolygon(xValues, yValues, 3);
                        

                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.getArea()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}
