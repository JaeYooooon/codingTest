import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != stack.peek())
                stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        int index = answer.length - 1;
        while(!stack.isEmpty()) {
            answer[index] = stack.pop();
            index--;
        }

        return answer;
    }
}