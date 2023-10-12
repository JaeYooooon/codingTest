import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            if(list.size() > k){
                list.remove(Collections.min(list));
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}