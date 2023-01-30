import java.util.*;
class Solution {
    public int solution(String s) {       
        int answer = 0;       

        Stack<Integer> stack = new Stack<>();

        for(String x : s.split(" ")) {
            if(x.equals("Z")) {
                if(!stack.isEmpty()) 
                    answer -= stack.pop();
            }      
            else 
                answer += stack.push(Integer.parseInt(x));
        }

        return answer;
    }
}