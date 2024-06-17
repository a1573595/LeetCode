import kotlin.math.max

fun main() {
    println(rob(intArrayOf(1, 2, 3, 1)))
    println(rob(intArrayOf(2, 7, 9, 3, 1)))
    println(rob(intArrayOf(2, 1, 1, 2)))
}

/// todo
fun rob(nums: IntArray): Int {
    val dp = nums.toMutableList()

    for (i in nums.indices) {
        for (j in i + 2..<nums.size) {
            dp[j] = max(dp[j], dp[i] + nums[j])
        }
    }

    return dp.max()
}