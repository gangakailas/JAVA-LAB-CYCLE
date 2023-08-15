package nString;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ganga
 */
public class nString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=Integer.parseInt(args[0]);
        String s=args[1];
        
        while(num>0)
        {
            System.out.print(s+" ");
            num--;
        }
        
    }
    
}
