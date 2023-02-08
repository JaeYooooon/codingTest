class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i, j;
        if(a >= b){
            j = a;
            i = b;
        }else{
            i = a;
            j = b;
        }
        for(int k = i; k <= j; k++){
            answer += k;
        }
        return answer;
    }
}