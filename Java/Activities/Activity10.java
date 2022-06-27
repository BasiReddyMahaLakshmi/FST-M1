package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Sree");
        names.add("Hari");
        names.add("Maha");
        names.add("Lakshmi");
        names.add("Anand");
        names.add("Sky");
        System.out.println("Size of the set is : " + names.size());
        if (names.remove("Hari")) {
            System.out.println("Hari is removed from the set");
        }
           else{
               System.out.println("Hare is present in the set");
            }
        System.out.println("Check if Lakshmi exist in set : " +names.contains("Lakshmi"));
        System.out.println("Updated set : " +names);


    }

}
