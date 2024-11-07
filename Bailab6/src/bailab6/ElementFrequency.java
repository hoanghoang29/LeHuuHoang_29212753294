/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class ElementFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhap so nguyen can đem: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + target + " trong mang la: " + count);

        scanner.close();
    }
}
