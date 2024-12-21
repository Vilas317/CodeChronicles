// Definition for singly-linked list
class ListNode {
    public int val; // Value of the node
    public ListNode next; // Reference to the next node

    // Constructor to initialize the node with a value
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Middleelementoflinkedlist {
//Brute Force
    // Function to find the middle element of the linked list
    public int solve(ListNode A) {
         /*int count = 0;
        ListNode temp = A;

        // First pass: Count the number of nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Calculate the mid index
        int mid = count / 2;

        // Second pass: Traverse to the middle node
        temp = A;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }

        // Return the value of the middle node
        return temp.val;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create an instance of the solution class
        Middleelementoflinkedlist solution = new Middleelementoflinkedlist();

        // Find and print the middle element
        System.out.println("Middle element: " + solution.solve(head));
    }
}*/
//Optimal Approach
ListNode slow = A;
ListNode fast = A;

while(fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;
}
return slow.val;
    }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create an instance of the solution class
        Middleelementoflinkedlist solution = new Middleelementoflinkedlist();

        // Find and print the middle element
        System.out.println("Middle element: " + solution.solve(head));
    }
}