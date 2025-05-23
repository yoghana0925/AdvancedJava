package String;

//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
public class q8isNumeric {

 // User-defined function to check if a string contains only numeric characters
 public static boolean isNumeric(String str) {
     if (str == null || str.isEmpty()) {
         return false;
     }
     return str.matches("\\d+"); // regex for one or more digits
 }

 public static void main(String[] args) {
     // Sample input
     String input = "123456";

     // Print the input
     System.out.println("Input String: " + input);

     // Check and display whether it is numeric
     if (isNumeric(input)) {
         System.out.println("The string contains only numeric characters.");
     } else {
         System.out.println("The string does NOT contain only numeric characters.");
     }
 }
}

