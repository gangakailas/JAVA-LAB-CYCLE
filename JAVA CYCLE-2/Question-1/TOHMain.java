/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TowerOfHanoi;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class TOHMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number of disks preferred: ");
        num=sc.nextInt();
        
        TowerOfHanoi.Tower(num, 'A', 'B', 'C');

    }
    
}
