class Solution {
    public int[] solution(int d1, int n1, int d2, int n2) {
        int d = d1 * n2 + d2 * n1;
        int n = n1 * n2;
        int gcd = gcd(d, n);
        return new int[]{d / gcd, n / gcd};
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
