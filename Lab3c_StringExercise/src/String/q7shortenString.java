package String;

//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()

public class q7shortenString {

 // User-defined function to truncate a string and add ellipsis
 public static String truncate(String str, int maxLength) {
     if (str == null || str.length() <= maxLength) {
         return str;
     }

     // Ensure there's room for "..." in the result
     if (maxLength <= 3) {
         return str.substring(0, maxLength); // too small to add ellipsis
     }

     return str.substring(0, maxLength - 3) + "...";
 }

 public static void main(String[] args) {
     // Example input
     String input = "This is a very long sentence that needs to be shortened.";

     // Desired maximum length
     int maxLength = 25;

     // Print original string
     System.out.println("Original String: " + input);

     // Call the truncate function
     String result = truncate(input, maxLength);

     // Print truncated string
     System.out.println("Truncated String: " + result);
 }
}

