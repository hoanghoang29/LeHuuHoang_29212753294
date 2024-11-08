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

public class KeywordSearch {

    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");

        if (keywords.contains("Python")) {
            System.out.println("Python co trong danh sach.");
        } else {
            System.out.println("Python khong co trong danh sach.");
        }
    }
}
