package com.geekbrains.queuetypes;

public class Reverser {
    public String reverse(String s) {
        MyStack<Character> stack = new MyStack<>();
        char[] charArray = s.toCharArray();
        for (char c: charArray) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
