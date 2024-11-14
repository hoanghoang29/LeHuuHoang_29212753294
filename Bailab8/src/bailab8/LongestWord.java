/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab8;

/**
 *
 * @author Admin
 */
public class LongestWord {
    
 public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String text = "I love programming";
        String longestWord = findLongestWord(text);
        System.out.println("Tu dai nhat trong chuoi: " + longestWord);
    }
}
