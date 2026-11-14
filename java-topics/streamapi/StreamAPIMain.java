
import java.util.LinkedList;

public class StreamAPIMain {
    public static void main(String[] args) {
        Fundamentals fundamentals = new Fundamentals();

        // This package is used to demonstrate the usage of Stream API in Java. The Stream API provides a functional approach to processing sequences of elements, such as collections, in a declarative manner.

        // The Stream API allows you to perform operations like filtering, mapping, and reducing on collections in a concise and readable way. It enables you to write code that is more expressive and easier to understand.

        System.err.println("Removing duplicates from a linked list using Stream API:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        LinkedList<Integer> uniqueList = fundamentals.removingDuplicates(list);
        System.out.println("Original List: " + list);
        System.out.println("List after removing duplicates: " + uniqueList);

        
    }
}
