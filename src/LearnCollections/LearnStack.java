package LearnCollections;

import java.util.Stack;

// Stack - LIFO rule
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        System.out.println("Numbers" + stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println("Numbers" + stack);

        System.out.println(stack.peek());
    }
}
