/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bailab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TinhTong {
    public static void main(String[] args){
    // Bài 2: Tổng các chữ số của một số nguyên n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n: ");
        int n = scanner.nextInt();
        int sumDigits = 0;
        
        while (n != 0) {
            sumDigits += n % 10;
            n /= 10;
        }
        System.out.println("Tong cac chu so cua n la: " + sumDigits);
    }
}
