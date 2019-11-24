/*
 *   Title: Print reversed list
 *
 *   Given a linked list, write a function that prints the nodes of the 
 *   list in reverse order.
 * 
 *   Execution: javac PrintReversedList.java && java PrintReversedList
 */

public class ReversedLinkList {

    private static class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void printReversedList(Node n) {
        if (n == null) {
            return;
        }
        printReversedList(n.next); // return null
        System.out.println(n.value); // print value n=1, n=2, n=3, n=null
    }

    // Test case
    public static void test() {
        System.out.println("Original LinkedList: 1->2->3");
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        // n.next.next.next = new Node(4);
        printReversedList(n);
    }

    // Sample test cases
    public static void main(String[] args) {
        test();
        System.out.println("\n");
    }
}