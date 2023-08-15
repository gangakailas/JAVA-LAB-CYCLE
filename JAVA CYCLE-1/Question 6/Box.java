/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author ganga
 */
class Box extends Rectangle
{
    private int height;
    private int volume=0;
    
    public Box()
    {
        super();
        height=0;
    }
    public Box(int l, int b, int h)
    {
        super(l, b);
        height=h;
    }
    public int getVolume()
    {
        volume=length*breadth*height;
        return volume;
    }
    
    
    
}
