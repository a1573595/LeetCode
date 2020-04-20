package easy

// https://leetcode.com/problems/maximum-subarray/

fun main() {
    println(maxSubArray(intArrayOf(1, 2, 3, 4))) // 10
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))) // 6
    println(maxSubArray(intArrayOf(-1))) // -1

    println(maxSubArray2(intArrayOf(1, 2, 3, 4))) // 10
    println(maxSubArray2(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))) // 6
    println(maxSubArray2(intArrayOf(-1))) // -1

    println(maxSubArray3(intArrayOf(1, 2, 3, 4))) // 10
    println(maxSubArray3(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))) // 6
    println(maxSubArray3(intArrayOf(-1))) // -1
}

// Time Limit Exceeded
fun maxSubArray(nums: IntArray): Int {
    var max = nums[0]

    for (i in 1..nums.size) {    // 有幾個數字
        for (j in 1..nums.size - i + 1) {    //  有幾種組合
            var sum = 0 // 總和

            var index = j - 1
            while (index - j + 1 < i) {
                sum += nums[index++]
            }

            if (sum > max) { // 如果比較大
                max = sum
            }
        }
    }

    return max
}

fun maxSubArray2(nums: IntArray): Int {
    var max = nums[0]

    for (i in nums.indices) {
        var sum = 0 // 總和
        for (j in i until nums.size) {
            sum += nums[j]
            if (sum > max) { // 如果比較大
                max = sum
            }
        }
    }

    return max
}

// 無法應付負數
fun maxSubArray3(nums: IntArray): Int {
    var max = nums[0]
    var sum = 0

    for (n in nums) {
        sum += n
        sum = Math.max(0, sum)
        max = Math.max(sum, max)
    }
    return max
}