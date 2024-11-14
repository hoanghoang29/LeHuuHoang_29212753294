/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailab8;

/**
 *
 * @author Admin
 */
public class RemoveExtraSpaces {
    
public static String removeExtraSpaces(String str) {
       
    return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "   Hello     World   ";
        String result = removeExtraSpaces(text);
        System.out.println("Chuoi sau khi xoa cac khoang trang thua: '" + result + "'");
    }
}
