
package lab_5d;


public class Point {
    
    private int x;
    private int y;
    private int z;
    
    public Point(int newX, int newY, int newZ){
        
        this.setX(newX);
        this.setY(newY);
        this.setZ(newZ);
        
        
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        if((x < 500) && (x > 0))
            this.x = x;
        
        if (x < 0)
            this.x = 0;
        
        if (x > 500)
            this.x = 500;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if((y > 0) && (y < 500))
            this.y = y;
        
        if(y < 0)
            this.y = 0;
        
        if (y > 500)
            this.y = 500;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        
        if((y > 0) && (y < 500))
            this.z = y;
        
        if(y < 0)
            this.z = 0;
        
        if (y > 500)
            this.z = 500;
        
        this.z = z;
    }
    
    
    
    public String toString(){
        
        return (this.x + "," + this.y + "," + this.z);
    }
    
}
