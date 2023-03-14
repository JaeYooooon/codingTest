import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>(); 
        int maxDay = 0; 
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]); 
            if (maxDay < day) { 
                maxDay = day; 
                list.add(1); 
            } else {
                int lastIndex = list.size() - 1;
                list.set(lastIndex, list.get(lastIndex) + 1); 
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}