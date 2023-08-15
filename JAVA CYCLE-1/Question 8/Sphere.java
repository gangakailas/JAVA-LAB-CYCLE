/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author ganga
 */
class Sphere implements Shapes
{
    double radius;
    
    public Sphere()
    {
        radius=0.0;
    }
    public Sphere(double r)
    {
        radius=r;
    }
    
    @Override
    public double printVolume()
    {
        double vol=(4/3)*3.14*radius*radius;
        return vol;
    }
    public double printArea()
    {
        double ar=4*3.14*radius*radius;
        return ar;
    }
    
}
