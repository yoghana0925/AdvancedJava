package string;

//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().

public class q1IsNullOrEmpty{

 // User-defined function to check if a string is null or contains only whitespace
 public static boolean isNullOrEmpty(String str) {
     return str == null || str.trim().isEmpty();
 }

 public static void main(String[] args) {
     // Test cases
     String test1 = null;
     String test2 = "     ";
     String test3 = "Hello";

     System.out.println("Test 1: " + isNullOrEmpty(test1)); // true
     System.out.println("Test 2: " + isNullOrEmpty(test2)); // true
     System.out.println("Test 3: " + isNullOrEmpty(test3)); // false
 }
}
