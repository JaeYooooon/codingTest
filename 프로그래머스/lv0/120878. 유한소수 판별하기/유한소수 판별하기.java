class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        for (;b%2 == 0;) {
            b = b/2;
        }
        for (;b%5 == 0;) {
            b = b/5;
        }

        if ((a/(double)b)%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}