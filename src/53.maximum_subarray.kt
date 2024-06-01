fun main() {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(maxSubArray(intArrayOf(1)))
    println(maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    println(maxSubArray(intArrayOf(-1, -2)))
    println(maxSubArray(intArrayOf(1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4)))
}

fun maxSubArray(nums: IntArray): Int {
    var curSum = nums.first()
    var maxSum = nums.first()

    for (i in 1..<nums.size) {
        curSum = Math.max(curSum + nums[i], nums[i])
        maxSum = Math.max(maxSum, curSum)
    }

    return maxSum
}
