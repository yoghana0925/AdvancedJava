package string;

//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString(). also print mainstring

public class q3reverseString {

 // User-defined function to reverse a string
 public static String reverseString(String str) {
     if (str == null) return null;
     return new StringBuilder(str).reverse().toString();
 }

 public static void main(String[] args) {
     // Main string
     String mainString = "Java Programming";

     // Call the reverseString() function
     String reversedString = reverseString(mainString);

     // Output
     System.out.println("Original String: " + mainString);
     System.out.println("Reversed String: " + reversedString);
 }
}

