class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = n;

        while (p != 0) {
            p += 6;
            p %= n;
            answer++;
        }
        return answer;
    }
}