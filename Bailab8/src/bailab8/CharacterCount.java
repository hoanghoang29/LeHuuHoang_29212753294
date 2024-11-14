/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bailab8;


 public class CharacterCount {

    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "hello world";
        char characterToCount = 'o';
        int count = countCharacter(text, characterToCount);
        System.out.println("Ky tu '" + characterToCount + "' xuat hien " + count + " lan trong chuoi.");
    }
}

