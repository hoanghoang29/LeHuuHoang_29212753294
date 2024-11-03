/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bailab3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class bac1 {

    /**
     * @param args the command line arguments
     */

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.print("nhap gia tri b: ");
        Double b = scanner.nextDouble();
        scanner.close();
        if (a==0) {
            if (b==0) {
                System.out.print("phuong trinh vo so nghiem");
            } else {
                System.out.print("phuong trinh vo nghiem");
            }
        } else {
            Double x=-b/a;
            System.out.print("phuong trinh co nghiem x= " + x);
        }
        scanner.close();
    }
    
}
