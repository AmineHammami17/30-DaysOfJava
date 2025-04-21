import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[][] Numbers= { {1,3,5},{2,4,6}};
        // Access to elements
        System.out.println(Numbers[0][1]); // First array , Second Number
        System.out.println(Numbers[1][2]); // Second array , Third Number
        System.out.println(Numbers[1][1]); // Test before changing the value
        Numbers[1][1] = 9; // Change the value of element 2 in array 2
        System.out.println(Numbers[1][1]);
        for (int i=0;i<Numbers.length;++i){
            for (int j=0;j<Numbers[i].length;++j){
                System.out.println(Numbers[i][j]);
            }
        }
        // Java Data Structures :
            //Java Array Lists :
        ArrayList<String> anime = new ArrayList<String>();
        anime.add("Naruto");
        anime.add("Bleach");
        anime.add("One Piece");
        System.out.println(anime);
        anime.add(1,"DBZ"); // Add at specified position
        System.out.println(anime);
        // Access and Setters using get and set
        System.out.println(anime.get(0));
        anime.set(2, "Jujutsu Kaisen");
        // FOR LOOP :
        for (String i : anime) {
            System.out.println(i);
        }
        // remove() to remove an item with certain position
        // .size() returns length of an array
        // .sort() in the package Collections for sorting lists

        //Linked Lists
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        // Linked lists are built like arrayLists however they store items in containers the list has a link to the first container and each container
        // has a link to the next container in the list
        // It is more used to manipulate data
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.addFirst("Mercedes");
        cars.addLast("Hyundai");
        System.out.println("List after adding cars : " +cars);
        cars.removeLast();
        cars.removeFirst();

        System.out.println("List after deletion : " +cars);

        // HashMaps
        // Store items in key/value  pairs
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Tunisia","Tunis");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Spain","Madrid");
        System.out.println(capitalCities);

        //Size
        capitalCities.size();

        //Access an item
        capitalCities.get("England");

        //Remove an item
        capitalCities.remove("England");

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        //Clear all items
        capitalCities.clear();














    }
}