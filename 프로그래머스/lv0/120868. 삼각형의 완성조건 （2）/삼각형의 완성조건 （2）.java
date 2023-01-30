class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        int max = sides[0] + sides[1] - 1;
        int min = 0;

        if (sides[0] > sides[1]) {
            min = sides[0] - sides[1];
        } else {
            min = sides[1] - sides[0];
        }

        answer = max - min;
        return answer;
    }
}
