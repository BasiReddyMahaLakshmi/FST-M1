package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Maha");
        myList.add("Lakshmi");
        myList.add("Lakshami");
        myList.add("Laxmi");
        myList.add("Chinnari");
        System.out.println(myList);
        for(String name:myList){
        }
        System.out.println("third element is: " + myList.get(2));
        System.out.println("Contains: " + myList.contains("Maha"));
        System.out.println("Size: " + myList.size());
        myList.remove("Chinnari");
        System.out.println("New Size after removal: " + myList.size());


    }
}
