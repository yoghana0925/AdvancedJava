package string;

//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
public class q4isPalindrome{

 // User-defined function to check for palindrome (ignoring case and punctuation)
 public static boolean isPalindrome(String str) {
     if (str == null) return false;

     // Remove all non-alphanumeric characters and convert to lowercase
     String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

     // Reverse the cleaned string
     String reversed = new StringBuilder(cleaned).reverse().toString();

     // Check if cleaned string is equal to its reverse
     return cleaned.equals(reversed);
 }

 public static void main(String[] args) {
     // Test input
     String input = "A man, a plan, a canal, Panama";

     // Output
     System.out.println("Original String: " + input);
     System.out.println("Is Palindrome? " + isPalindrome(input));
 }
}
