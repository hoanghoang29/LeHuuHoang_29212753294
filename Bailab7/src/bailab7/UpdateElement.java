/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab7;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class UpdateElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        numbers.set(2, 100);

        System.out.println("Danh sach sau khi cap nhat: " + numbers);
    }
}
