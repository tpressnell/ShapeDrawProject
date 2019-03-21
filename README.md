# ShapeDrawProject
A program where the user can randomly generate shapes and draw them in a window on the screen that I wrote in my CS 232 class.

This was the first assignment that I had that used inheritance and super classes. The Shape class is the super class for this program. The Circle, Rectangle, and Triangle classes inherit the members from the Shape class. There is also a Point class which holds the members for the center of each shape that is drawn by the program. It does not inherit members from the shape class. Now, I will give details on all of the classes used by the program.

## Point Class

## Shape Class

Here is the member, constructor, and abstract method for the shape class: 

```java

public abstract class Shape implements Comparable<Shape> {
    
    private Point center;
-----------------------------------------------------------------------

public Shape(int x, int y, int z){
        
        this.center = new Point(x,y,z);
   }
   
-----------------------------------------------------------------------

public abstract double getArea();

```

Since all of the shapes are different in this program, the only member that they share is their center. The x and y members locate the shape in the window as one would expect, and the z member allows for the shapes to look as if they are overlapping each other. The center is implemented as a Point object to make the other classes more simple to write and implement. The constructor simply creates the Point for the new center. The abstract getArea() method allows for each shape that inherits the Shape class to implement this function as it is needed for that specific shape's area.

## Circle Class

## Rectangle Class

## Triangle Class
