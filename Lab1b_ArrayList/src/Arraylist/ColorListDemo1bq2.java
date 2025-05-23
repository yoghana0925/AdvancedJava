package Arraylist;

//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList print input also

import java.util.ArrayList;

public class ColorListDemo1bq2 {

public static void main(String[] args) {
  // Create an ArrayList of colors
  ArrayList<String> colors = new ArrayList<>();

  // Add different colors to the ArrayList
  colors.add("Red");
  colors.add("Green");
  colors.add("Blue");
  colors.add("Yellow");
  colors.add("Black");

  // Print the original list
  System.out.println("Original Color List: " + colors);

  // Remove the 2nd element (index 1)
  if (colors.size() > 1) {
      colors.remove(1);
  }

  // Remove the color "Blue"
  colors.remove("Blue");

  // Print the updated list
  System.out.println("Updated Color List after removals: " + colors);
}
}

