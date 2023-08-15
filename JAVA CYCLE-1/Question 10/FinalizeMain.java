/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Finalize;

/**
 *
 * @author ganga
 */
public class FinalizeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Finalize f1= new Finalize(1, 2, 3);
        Finalize f2= new Finalize(6, 8, 9);
        f1.printAvg();
        f2.printAvg();
        f1=null;
        System.gc();
    }
    
}
