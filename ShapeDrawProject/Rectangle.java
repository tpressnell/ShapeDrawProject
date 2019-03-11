
package lab_5d;


public class Rectangle extends Shape {
    
     private double length;
    private double width;
    private Point center;
    
    public Rectangle(){
        super(0,0,0);
        this.length = 1;
        this.width = 1;
        
    }
    
    public Rectangle(int x, int y, int z, double newLength, double newWidth){
        super(x,y,z);
        this.setLength(1.0);
        this.setWidth(1.0);
        this.setLength(newLength);
        this.setWidth(newWidth);
        
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        
        return this.width;
    }
    
    public void setLength(double newLength){
        if(newLength > 0)
            this.length = newLength;
    }
    
    public void setWidth(double newWidth){
        
        if(newWidth > 0)
            this.width = newWidth;
    }

     @Override
    public double getArea(){
        return this.length * this.width;
    }
    
    @Override
    public String toString(){
        
        String result = "(" + super.getX() + "," + super.getY() + "," + super.getZ() + "): " + "[ " + this.getArea() + " ]";
        return result;
    }
    
}
