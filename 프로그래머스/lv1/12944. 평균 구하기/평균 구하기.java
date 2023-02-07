class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double res = 0;
        int len = arr.length;
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        answer = res/len;
        return answer;
    }
}