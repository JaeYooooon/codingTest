class Solution {
    public long solution(int balls, int share) {
        long answer = 0;

        int d = (balls - share) > share ? share : balls - share;
        if (d == 0) return 1;

        return solution(balls - 1, d - 1) * balls / d;
    }

}