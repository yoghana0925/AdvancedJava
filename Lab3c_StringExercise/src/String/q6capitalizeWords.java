package String;

//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()

public class q6capitalizeWords {

 // User-defined function to capitalize the first letter of each word
 public static String capitalizeWords(String str) {
     if (str == null || str.isEmpty()) {
         return str;
     }

     String[] words = str.split("\\s+");
     StringBuilder capitalized = new StringBuilder();

     for (String word : words) {
         if (word.length() > 0) {
             capitalized.append(Character.toUpperCase(word.charAt(0)));
             capitalized.append(word.substring(1).toLowerCase());
         }
         capitalized.append(" ");
     }

     return capitalized.toString().trim(); // remove trailing space
 }

 public static void main(String[] args) {
     // Input string
     String input = "java programming is fun";

     // Output the original input
     System.out.println("Original String: " + input);

     // Call the function to capitalize words
     String result = capitalizeWords(input);

     // Output the result
     System.out.println("Capitalized String: " + result);
 }
}
