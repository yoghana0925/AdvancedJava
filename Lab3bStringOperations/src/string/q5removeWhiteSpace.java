package string;

//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()

public class q5removeWhiteSpace {

 // User-defined function to remove all whitespace characters from a string
 public static String removeWhitespace(String str) {
     if (str == null) return null;
     return str.replaceAll("\\s", "");
 }

 public static void main(String[] args) {
     // Input string
     String input = "  Java   Programming\tis \nfun  ";

     // Call the function
     String result = removeWhitespace(input);

     // Output
     System.out.println("Original String: '" + input + "'");
     System.out.println("String without whitespace: '" + result + "'");
 }
}

