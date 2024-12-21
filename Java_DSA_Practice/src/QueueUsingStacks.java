import java.util.Stack;
//TC:O(N) SC:O(2N) appraoch
/*class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Constructor
    public MyQueue() {
    }

    // Push element x to the back of queue
    public void push(int x) {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        System.out.println("The element pushed is " + x);
        input.push(x);

        while (!output.isEmpty()) {
            input.push(output.pop());
        }
    }

    // Removes the element from in front of queue and returns that element
    public int pop() {
        if (input.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return -1 if queue is empty
        }
        int val = input.peek();
        input.pop();
        return val;
    }

    // Get the front element
    public int peek() {
        if (input.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return -1 if queue is empty
        }
        return input.peek();
    }

    // Get the size of the queue
    public int size() {
        return input.size();
    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}*/
//TC:O(1) SC:O(2N) appraoch
public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
    if(stack2.isEmpty()) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    return stack2.isEmpty() ? -1 : stack2.pop();
}

public int peek() {
    if(stack2.isEmpty()) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    return stack2.isEmpty() ? -1 : stack2.peek();
}

public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
}
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(3);
        queue.push(4);
        System.out.println("The element popped is " + queue.pop());
        queue.push(5);
        System.out.println("The top element is " + queue.peek());
        System.out.println("Is the queue empty? " + queue.empty());
    }
}