package DSA.Stacks;

import java.util.Stack;

public class Stacking {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(39);
        stack.push(2);
        stack.push(7);
        stack.push(54);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
