package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Green");
        colors.put(5,"Yellow");
        System.out.println("Map values are :" +colors);
        colors.remove(3);
        if(colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        System.out.println("Size of map is : " +colors.size());
    }
}
