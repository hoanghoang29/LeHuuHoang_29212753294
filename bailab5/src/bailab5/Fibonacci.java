/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu Fibonacci can in: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen duong.");
        } else {
            System.out.println("Chuoi Fibonacci " + n + " phan tu dau tien la:");

            int first = 0, second = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        scanner.close();
    }
}
