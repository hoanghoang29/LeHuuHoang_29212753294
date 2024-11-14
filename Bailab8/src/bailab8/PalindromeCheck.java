package bailab8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text1 = "madam";
        String text2 = "hello";

        System.out.println("Chuoi '" + text1 + "' la chuoi hoi van: " + isPalindrome(text1));
        System.out.println("Chuoi '" + text2 + "' la chuoi hoi van: " + isPalindrome(text2));
    }
}
