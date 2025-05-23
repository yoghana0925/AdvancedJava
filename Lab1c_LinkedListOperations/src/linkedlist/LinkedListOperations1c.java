package linkedlist;

//1c. Linked List Programs

//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
//4. Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )
//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

import java.util.*;

public class LinkedListOperations1c {
 public static void main(String[] args) {
     // Initialize LinkedList with some colors
     LinkedList<String> l_list = new LinkedList<>();
     l_list.add("Red");
     l_list.add("Blue");
     l_list.add("Green");
     l_list.add("Yellow");
     l_list.add("Purple");

     System.out.println("Original LinkedList: " + l_list);

     // 1. Iterate through all elements starting at the 2nd position (index 1)
     System.out.println("\n1. Iterating from 2nd position:");
     Iterator<String> iterator1 = l_list.listIterator(1);  // index starts at 1
     while (iterator1.hasNext()) {
         System.out.println(iterator1.next());
     }

     // 2. Iterate LinkedList in reverse order
     System.out.println("\n2. Iterating in reverse order:");
     Iterator<String> reverseIterator = l_list.descendingIterator();
     while (reverseIterator.hasNext()) {
         System.out.println(reverseIterator.next());
     }

     // 3. Insert element at the end using offerLast()
     System.out.println("\n3. Inserting 'Pink' at the end:");
     l_list.offerLast("Pink");
     System.out.println("LinkedList after inserting at end: " + l_list);

     // 4. Display elements and their positions
     System.out.println("\n4. Displaying elements with their positions:");
     for (int i = 0; i < l_list.size(); i++) {
         System.out.println("Position " + i + ": " + l_list.get(i));
     }

     // 5. Swap first and third elements (index 0 and 2)
     System.out.println("\n5. Swapping first and third elements:");
     if (l_list.size() >= 3) {
         Collections.swap(l_list, 0, 2);
         System.out.println("LinkedList after swap: " + l_list);
     } else {
         System.out.println("List does not have enough elements to swap.");
     }
 }
}

