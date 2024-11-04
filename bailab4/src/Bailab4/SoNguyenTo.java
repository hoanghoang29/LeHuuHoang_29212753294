/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bailab4;

/**
 *
 * @author Admin
 */
public class SoNguyenTo {
    public static void main(String[] args) {
    // Bài 3: In tất cả các số nguyên tố từ 1 đến 100
        System.out.println("Cac so nguyen to tu 1 den 100 la:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}    
