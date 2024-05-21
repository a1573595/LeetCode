fun main() {
    println(minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
    println(minSubArrayLen(4, intArrayOf(1, 4, 4)))
    println(minSubArrayLen(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)))
    println(minSubArrayLen(213, intArrayOf(12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12)))
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var sum = 0
    var len = 0

    for (i in nums.indices) {
        var left = 1
        sum = nums[i]

        while (sum < target && (i + left) < nums.size) {
            sum += nums[i + left]
            left++
        }

        if (sum >= target) {
            if (len != 0) {
                len = Math.min(len, left)
            } else {
                len = left
            }
        }
    }

    return len


//    var sum = 0
//    var len = 0
//
//    var left = 0
//
//    for(right in nums.indices) {
//        sum += nums[right]
//
//        while (sum >= target) {
//            if (len != 0) {
//              len = Math.min(len, right + 1 - left)
//            } else {
//              len = right + 1 - left
//            }
//
//            sum -= nums[left]
//            left += 1
//          }
//    }
//
//    return len
}