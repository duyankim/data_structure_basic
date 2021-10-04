package programmers.stackQueue;
import java.util.*;
public class Bracket {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else if (!stack.empty() && s.charAt(i) == ')') stack.pop();
        }

        return stack.empty();
    }
}
