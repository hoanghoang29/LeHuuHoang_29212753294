/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab8;

/**
 *
 * @author Admin
 */
public class WordCount {
    
public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "Java is fun";
        int wordCount = countWords(text);
        System.out.println("So tu trong chuoi: " + wordCount);
    }
}

