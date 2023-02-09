class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long res = 0;
        for(int i = 1; i <= count; i++){
            res += price * i;
        }
        
        if(res > money) answer = res - money;
        
        return answer;
    }
}