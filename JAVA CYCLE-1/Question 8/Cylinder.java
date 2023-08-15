/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author ganga
 */
class Cylinder implements Shapes
{
    double rad;
    double height;
    
    public Cylinder()
    {
        rad=0.0;
        height=0.0;
    }
    public Cylinder(double r, double h)
    {
        rad=r;
        height=h;
    }
    
    @Override
    public double printVolume()
    {
        double vol=3.14*rad*rad*height;
        return vol;
    }
    public double printArea()
    {
        double ar=2*3.14*rad*(rad+height);
        return ar;
    }
}
