import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer;
        if(num_list.length >= 11){
            answer = Arrays.stream(num_list).sum();
        }else{
            answer = Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        }
        return answer;
    }
}