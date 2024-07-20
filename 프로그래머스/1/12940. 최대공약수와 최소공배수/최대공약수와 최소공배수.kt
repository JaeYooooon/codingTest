class Solution {
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
    
    fun lcm(a: Int, b: Int, gcd: Int): Int {
        return (a * b) / gcd
    }
    
    fun solution(n: Int, m: Int): IntArray {
        val gcdValue = gcd(n, m)
        val lcmValue = lcm(n, m, gcdValue)
        return intArrayOf(gcdValue, lcmValue)
    }
}
