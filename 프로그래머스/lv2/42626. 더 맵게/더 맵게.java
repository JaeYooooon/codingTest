import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : scoville){
            queue.offer(i);
        }
        while(queue.peek() < K){
            if(queue.size() == 1){
                return -1;
            }
            int num1 = queue.poll();
            int num2 = queue.poll();
            int num = num1 + num2 * 2;
            queue.offer(num);
            answer++;
        }
        return answer;
    }
}