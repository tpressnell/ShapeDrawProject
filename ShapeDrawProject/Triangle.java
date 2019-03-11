
package lab_5d;


public class Triangle extends Shape {
    
    private double base;
    private double height;
    private Point center;
    
    public Triangle(){
        super(0,0,0);
        this.base = 1;
        this.height = 1;
        
    }
    
    public Triangle(int x, int y, int z, double newBase, double newHeight){
        super(x,y,z);
        this.setBase(1.0);
        this.setHeight(1.0);
        this.setBase(newBase);
        this.setHeight(newHeight);
        
    }
    
    public double getBase(){
        return this.base;
    }
    
    public double getHeight(){
        
        return this.height;
    }
    
    public void setBase(double newBase){
        if(newBase > 0)
            this.base = newBase;
    }
    
    public void setHeight(double newHeight){
        
        if(newHeight > 0)
            this.height = newHeight;
    }

    @Override
    public double getArea(){
        return ((this.base * this.height)/2);
    }
    
    @Override
    public String toString(){
        
        String result = "(" + super.getX() + "," + super.getY() + "," + super.getZ() + "): " + "/ " + this.getArea() + " \\";
        return result;
    }
    
}
