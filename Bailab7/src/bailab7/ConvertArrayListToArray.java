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

public class ConvertArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

      
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);

    
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
