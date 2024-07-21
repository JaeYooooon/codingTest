import java.util.*

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val queue1: Queue<String> = LinkedList(Arrays.asList(*cards1))
        val queue2: Queue<String> = LinkedList(Arrays.asList(*cards2))
        for (text in goal) {
            if (queue1.isNotEmpty() && queue1.peek() == text) {
                queue1.poll()
                continue
            }
            if (queue2.isNotEmpty() && queue2.peek() == text) {
                queue2.poll()
                continue
            }
            return "No"
        }
        return "Yes"
    }
}
