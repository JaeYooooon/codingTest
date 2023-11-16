import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char currentDigit = number.charAt(i);

            while (k > 0 && !stack.isEmpty() && stack.peek() < currentDigit) {
                stack.pop();
                k--;
            }

            stack.push(currentDigit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        for (char digit : stack) {
            answer.append(digit);
        }

        return answer.toString();
    }
}
