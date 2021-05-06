package pl.michalrola._5_Generics.Item29;

import pl.michalrola._5_Generics.Item29.GenerifyCollection.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        while (!stack.isEmpty()){
            System.out.println(stack.pop().toLowerCase());
        }
    }
}
