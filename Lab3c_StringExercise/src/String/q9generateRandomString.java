package String;

//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
import java.util.Random;

public class q9generateRandomString {

 // User-defined function to generate a random string of given length
 public static String generateRandomString(int length) {
     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     Random random = new Random();
     StringBuilder sb = new StringBuilder(length);

     for (int i = 0; i < length; i++) {
         int index = random.nextInt(characters.length());
         sb.append(characters.charAt(index));
     }

     return sb.toString();
 }

 public static void main(String[] args) {
     // Desired length of the random string
     int length = 12;

     // Generate the random string
     String randomStr = generateRandomString(length);

     // Print the result
     System.out.println("Generated Random String (" + length + " characters): " + randomStr);
 }
}

