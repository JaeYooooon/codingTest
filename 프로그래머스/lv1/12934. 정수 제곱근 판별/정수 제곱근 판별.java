class Solution {
    public long solution(long n) {
        long answer = 0;
        Double res = Math.sqrt(n);
        if(res == res.intValue()){
            answer = (long)Math.pow(res + 1, 2);
        }else{
            answer = -1;
        }
        
        return answer;
    }
}