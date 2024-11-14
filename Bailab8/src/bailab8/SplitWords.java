/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab8;

/**
 *
 * @author Admin
 */
public class SplitWords {
    
public static String[] splitWords(String str) {
        return str.split(" ");
    }

    public static void main(String[] args) {
        String text = "Java is fun";
        String[] words = splitWords(text);

        System.out.println("Mang cac tu:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}