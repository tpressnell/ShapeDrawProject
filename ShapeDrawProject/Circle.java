
package lab_5d;


public class Circle extends Shape {
    
     private double radius;
    private Point center;
   
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double newRadius){
        
        if(newRadius >= 0)
            this.radius = newRadius;
    }
    
    public Circle(){
        super(0,0,0);
        this.radius = 1.0;
        
        
    }
    
    public Circle(int x, int y, int z, double newRadius){
        
        super(x,y,z);
        this.setRadius(1.0);
        this.setRadius(newRadius);
        
        
        
    }
    
    public double getCircumference(){
        
        return (2* Math.PI * this.radius);
    }
    
     @Override
    public double getArea(){
        
        return (Math.PI * Math.pow(this.radius, 2));
    }
    
    public double getDiameter(){
        
        return(2 * this.radius);
    }
    
    @Override
    public String toString(){
        
        String result = "("+ super.getX() + "," + super.getY() + "," + super.getZ() + "): "+ "( " + this.getArea() + " )";
        return result;
    }
    
}
