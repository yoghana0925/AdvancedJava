package Arraylist;

//5. Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.ArrayList;
import java.util.List;

public class sublistq5 {

 public static void main(String[] args) {
     // Create an ArrayList of colors
     ArrayList<String> colors = new ArrayList<>();

     // Add colors to the ArrayList
     colors.add("Red");
     colors.add("Green");
     colors.add("Blue");
     colors.add("Yellow");
     colors.add("Black");

     // Print the original list
     System.out.println("Original Color List: " + colors);

     // Extract the 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
     List<String> subList = colors.subList(0, 2);

     // Print the extracted sublist
     System.out.println("Extracted SubList (1st and 2nd elements): " + subList);
 }
}

