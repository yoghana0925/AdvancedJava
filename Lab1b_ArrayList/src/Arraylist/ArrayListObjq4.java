package Arraylist;

//4. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListObjq4 {

 public static void main(String[] args) {
     // Create an ArrayList of colors
     ArrayList<String> colors = new ArrayList<>();

     // Add colors to the ArrayList
     colors.add("Blue");
     colors.add("Red");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Black");

     // Print the original list
     System.out.println("Original Color List: " + colors);

     // Sort the ArrayList
     Collections.sort(colors);

     // Print the sorted list
     System.out.println("Sorted Color List: " + colors);
 }
}

