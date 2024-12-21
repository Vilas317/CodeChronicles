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

public class RemoveLoopfromLinkedList {
    public ListNode solve(ListNode A) {
        //Brute Force
        // Use a HashMap to track visited nodes
         /*HashMap<ListNode, Boolean> nodeMap = new HashMap<>();

        // Temporary pointer to traverse the list
        ListNode temp = A;
        ListNode prev = null; // To keep track of the previous node

        while (temp != null) {
            // If the node is already in the map, a loop is detected
            if (nodeMap.containsKey(temp)) {
                if (prev != null) {
                    prev.next = null; // Break the loop
                }
                return A; // Return the updated list
            }

            // Mark the current node as visited
            nodeMap.put(temp, true);

            // Move the pointers
            prev = temp;
            temp = temp.next;
        }

        // If no loop is detected, return the original list
        return A;
    }

    public static void main(String[] args) {
        // Create a sample linked list with a loop
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Call the function to remove the loop
        RemoveLoopfromLinkedList solution = new RemoveLoopfromLinkedList();
        ListNode updatedHead = solution.solve(head);

        // Print the updated linked list
        ListNode temp = updatedHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}*/
//Optimal Approach
ListNode slow = A;
ListNode fast = A;

while(fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;

    if(slow == fast) {
        break;
    }
}

if(fast == null || fast.next == null) {
    return A;
}

slow = A;
ListNode prev = null;

while(slow != fast) {
    prev = fast;
    slow = slow.next;
    fast = fast.next;
}

if(prev != null) {
    prev.next = null;
}

return A;
    }

    public static void main(String[] args) {
        // Create a sample linked list with a loop
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Call the function to remove the loop
        RemoveLoopfromLinkedList solution = new RemoveLoopfromLinkedList();
        ListNode updatedHead = solution.solve(head);

        // Print the updated linked list
        ListNode temp = updatedHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}