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

public class CityList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hanoi");
        cities.add("Saigon");
        cities.add("Da Nang");
        cities.add("Hue");
        cities.add("Can Tho");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
