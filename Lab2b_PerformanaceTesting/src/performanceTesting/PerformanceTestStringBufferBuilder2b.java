package performanceTesting;

//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.

public class PerformanceTestStringBufferBuilder2b {
 public static void main(String[] args) {
     int iterations = 10000;
     String text = "AIET";

     // Test StringBuffer
     StringBuffer buffer = new StringBuffer();
     long startTimeBuffer = System.nanoTime();
     for (int i = 0; i < iterations; i++) {
         buffer.append(text);
     }
     long endTimeBuffer = System.nanoTime();
     long durationBuffer = endTimeBuffer - startTimeBuffer;
     System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

     // Test StringBuilder
     StringBuilder builder = new StringBuilder();
     long startTimeBuilder = System.nanoTime();
     for (int i = 0; i < iterations; i++) {
         builder.append(text);
     }
     long endTimeBuilder = System.nanoTime();
     long durationBuilder = endTimeBuilder - startTimeBuilder;
     System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

     // Conclusion
     if (durationBuilder < durationBuffer) {
         System.out.println("\nStringBuilder is faster than StringBuffer for single-threaded operations.");
     } else {
         System.out.println("\nStringBuffer is faster or similar in performance (rare in single-threaded).");
     }
 }
}

