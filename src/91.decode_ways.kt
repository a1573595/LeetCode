fun main() {
    println(numDecodings("12"))
    println(numDecodings("226"))
    println(numDecodings("06"))
}

fun numDecodings(s: String): Int {
    val n = s.length
    val dp = IntArray(n + 1)
    dp[0] = 1

    for (i in 1..n) {
        val ch = s[i - 1].digitToInt()
        if (ch == 0) dp[i] = 0
        val preCh = if (i > 1) s[i - 2].digitToInt() else 0
        if (ch != 0) dp[i] += dp[i - 1]
        if (preCh != 0 && preCh <= 1 || preCh == 2 && ch <= 6) dp[i] += dp[i - 2]
    }

    return dp[n]
}