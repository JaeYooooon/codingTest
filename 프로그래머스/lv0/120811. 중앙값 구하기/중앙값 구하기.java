import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int i = array.length/2;
        answer += array[i];
        
        return answer;
    }
}