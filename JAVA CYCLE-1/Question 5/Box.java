/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Box;

/**
 *
 * @author ganga
 */
class Box {
    
    private int length;
    private int breadth;
    private int height;
    private int area;
    private int volume;
    
    public Box(int a)
    {
        length=a;
        breadth=a;
        height=a;
    }
    public Box(int a, int b)
    {
        length=a;
        breadth=a;
        height=b;
    }
    public Box(int a, int b, int c)
    {
        length=a;
        breadth=b;
        height=c;
    }
    
    public int findArea()
    {
        area=2*(length+breadth+height);
        return area;
    }
    
    public int findVolume()
    {
        volume=length*breadth*height;
        return volume;
    }
    
}
