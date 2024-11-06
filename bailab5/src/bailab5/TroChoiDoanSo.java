/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bailab5;

/**
 *
 * @author Admin
 */
import java.util.Random;
import java.util.Scanner;

public class TroChoiDoanSo {

    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(50) + 1;  
        try (Scanner scanner = new Scanner(System.in)) {
            int guess = 0;
            
            System.out.println("Chao mung ban den voi tro choi doan so!");
            System.out.println("Hay doan mot so tu 1 den 50:");
            
   
            while (guess != targetNumber) {
                System.out.print("Nhap du doan cua ban: ");
                
                
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    
                  
                    if (guess < targetNumber) {
                        System.out.println("So cua ban thap hon. Thu lai!");
                    } else if (guess > targetNumber) {
                        System.out.println("So cua ban cao hon. Thu lai!");
                    } else {
                        System.out.println("Chuc mung! Ban da doan dung so " + targetNumber);
                    }
                } else {
                    System.out.println("Vui long nhap mot so nguyen.");
                    scanner.next(); 
                }
            }
        }
    }

}
