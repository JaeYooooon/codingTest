import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)
                .toArray();
    }
}