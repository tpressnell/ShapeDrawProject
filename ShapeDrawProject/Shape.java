
package lab_5d;


public abstract class Shape implements Comparable<Shape> {
    
    private Point center;
    
    
    public Shape(int x, int y, int z){
        
        this.center = new Point(x,y,z);
    }

    public Point getCenter() {
        return this.center;
    }
    
    public int getX(){
        return this.center.getX();
    }
    
    public int getY(){
        return this.center.getY();
    }
    
    public int getZ(){
        return this.center.getZ();
    }
    
    @Override
    public int compareTo(Shape s){
        return (int)(this.getArea() - s.getArea());
                
    }
    
    public abstract double getArea();
    
    
    
}
