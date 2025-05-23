package string;

//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()

public class q2countOccurances {

 // User-defined function to count occurrences of a substring
 public static int countOccurrences(String mainStr, String subStr) {
     if (mainStr == null || subStr == null || subStr.isEmpty()) {
         return 0;
     }

     int count = 0;
     int index = 0;

     while ((index = mainStr.indexOf(subStr, index)) != -1) {
         count++;
         index += subStr.length(); // move past the found substring
     }

     return count;
 }

 public static void main(String[] args) {
     // Test cases
     String mainString = "hello world, hello universe, hello Java";
     String substring = "hello";

     int occurrences = countOccurrences(mainString, substring);
     System.out.println("The mainString:"+mainString);
     System.out.println("The substring '" + substring + "' appears " + occurrences + " times.");
 }
}
