import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().orElse(0.0);
    }
}