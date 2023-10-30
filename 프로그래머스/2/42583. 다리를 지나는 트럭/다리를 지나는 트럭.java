import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
		Queue<Integer> q = new LinkedList<Integer>();
		int sum = 0; 
		
		for(int t : truck_weights) {
			while(true) {
				if(q.isEmpty()) {
					q.offer(t);
					sum += t;
					answer++;
					break;
				}
				else if(q.size() == bridge_length) {
					sum -= q.poll();
				}
				else {
					if(sum + t > weight) {
						q.offer(0);
						answer++;
					}
					else {
						q.offer(t);
						sum += t;
						answer++;
						break;
					}
				}
			}
		}
		
		return answer + bridge_length;
	}
}