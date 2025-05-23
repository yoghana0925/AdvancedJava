package string;

//2 a. Develop a java program for performing various string operations with different string
//handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith()


public class StringOperationsDemo2a {
 public static void main(String[] args) {

     // 1. String Creation and Basic Operations
     String str1 = "Hello";
     String str2 = "World";
     System.out.println("1. String Creation:");
     System.out.println("str1: " + str1);
     System.out.println("str2: " + str2);

     // 2. Length and Character Access
     System.out.println("\n2. Length and Character Access:");
     System.out.println("Length of str1: " + str1.length());
     System.out.println("Character at index 1 in str1: " + str1.charAt(1));

     // 3. String Comparison
     String str3 = "hello";
     System.out.println("\n3. String Comparison:");
     System.out.println("str1.equals(str3): " + str1.equals(str3));
     System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
     System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

     // 4. String Searching
     System.out.println("\n4. String Searching:");
     String sentence = "Welcome to Java programming!";
     System.out.println("Sentence: " + sentence);
     System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
     System.out.println("Contains 'Java': " + sentence.contains("Java"));

     // 5. Substring Operations
     System.out.println("\n5. Substring Operations:");
     System.out.println("Substring (11 to 15): " + sentence.substring(11, 15));

     // 6. String Modification
     System.out.println("\n6. String Modification:");
     System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));
     System.out.println("To Uppercase: " + str1.toUpperCase());
     System.out.println("To Lowercase: " + str2.toLowerCase());

     // 7. Whitespace Handling
     System.out.println("\n7. Whitespace Handling:");
     String messy = "   Trim this string!   ";
     System.out.println("Before trim: '" + messy + "'");
     System.out.println("After trim: '" + messy.trim() + "'");

     // 8. String Concatenation
     System.out.println("\n8. String Concatenation:");
     String full = str1 + " " + str2;
     System.out.println("Concatenated String: " + full);
     System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

     // 9. String Splitting
     System.out.println("\n9. String Splitting:");
     String colors = "Red,Green,Blue,Yellow";
     String[] colorArray = colors.split(",");
     for (String color : colorArray) {
         System.out.println(color);
     }

     // 10. StringBuilder Demo
     System.out.println("\n10. StringBuilder Demo:");
     StringBuilder sb = new StringBuilder("Java");
     sb.append(" Programming");
     sb.insert(0, "Welcome to ");
     sb.replace(11, 15, "Python");
     sb.reverse();
     System.out.println("StringBuilder result: " + sb.reverse()); // reversed back to readable

     // 11. String Formatting
     System.out.println("\n11. String Formatting:");
     String name = "Alice";
     int age = 22;
     System.out.println(String.format("Name: %s, Age: %d", name, age));

     // 12. Validate Email using contains(), startsWith(), endsWith()
     System.out.println("\n12. Validate Email:");
     String email = "student@example.com";
     boolean isValid = email.contains("@") && email.endsWith(".com") && email.indexOf("@") > 0;
     System.out.println("Email: " + email);
     System.out.println("Starts with 'student': " + email.startsWith("student"));
     System.out.println("Ends with '.com': " + email.endsWith(".com"));
     System.out.println("Valid email? " + isValid);
 }
}

