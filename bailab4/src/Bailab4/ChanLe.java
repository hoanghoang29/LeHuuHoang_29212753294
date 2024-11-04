/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bailab4;

public class ChanLe {
    public static void main(String[] args) {
        // Bài 1: Tổng số lẻ và số chẵn từ 1 đến 100
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100 la: " + sumEven);
        System.out.println("Tong cac so le tu 1 den 100 la: " + sumOdd);
    }
}    
