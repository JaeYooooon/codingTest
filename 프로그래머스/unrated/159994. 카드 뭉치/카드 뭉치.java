import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
        
        for(String text : goal){
            if(queue1.size() != 0 && queue1.peek().equals(text)){
                queue1.poll();
                continue;
            }
            if(queue2.size() != 0 && queue2.peek().equals(text)){
                queue2.poll();
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}
