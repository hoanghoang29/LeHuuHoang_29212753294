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
import java.util.Arrays;

public class ArraySortAscending {

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

        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep theo thu tu tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
