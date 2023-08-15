/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TowerOfHanoi;

/**
 *
 * @author ganga
 */
public class TowerOfHanoi {
    
    public static void Tower(int n, char start, char end, char path)
    {
        if(n==0)
        {
            return;
        }
        Tower(n-1, start, path, end);
        System.out.println("Move disk "+n+" from rod "+start+" to rod "+end);
        Tower(n-1, path, end, start);
    }
}
