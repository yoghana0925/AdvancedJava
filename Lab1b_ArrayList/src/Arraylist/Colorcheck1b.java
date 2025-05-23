
package Arraylist;
// 1b. Array List programs

// 1. Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not
import java.util.ArrayList;

public class Colorcheck1b {

    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add different colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");

        // Display the color list
        System.out.println("Color List: " + colors);

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}
