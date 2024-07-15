class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val start = minOf(a, b)
        val end = maxOf(a, b)
        
        for (n in start..end) {
            answer += n
        }
        
        return answer
    }
}
