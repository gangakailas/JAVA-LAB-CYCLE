/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author ganga
 */
class Rectangle {
    
    protected int length;
    protected int breadth;
    protected int area;
    
    public Rectangle()
    {
        length=0;
        breadth=0;
        area=0;
    }
    
    public Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    public int getArea()
    {
        area=length*breadth;
        return area;
    }
    
}
