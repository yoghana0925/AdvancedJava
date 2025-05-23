package String;

//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
public class q10numOfWord {

 // User-defined function to count words in a string
 public static int countWords(String str) {
     if (str == null || str.trim().isEmpty()) {
         return 0;
     }

     // Split the string based on one or more whitespace characters
     String[] words = str.trim().split("\\s+");
     return words.length;
 }

 public static void main(String[] args) {
     // Example input string
     String input = "  Java is a widely-used programming language.  ";

     // Print original string
     System.out.println("Input String: \"" + input + "\"");

     // Count the words
     int wordCount = countWords(input);

     // Print the result
     System.out.println("Number of words: " + wordCount);
 }
}

