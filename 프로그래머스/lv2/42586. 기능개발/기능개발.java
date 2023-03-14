import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }

        int cnt = 1;
        int first = queue.poll();

        while (!queue.isEmpty()) {
            int second = queue.poll();
            if (first >= second) {
                cnt++;
            } else {
                answerList.add(cnt);
                cnt = 1;
                first = second;
            }
        }
        answerList.add(cnt);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}