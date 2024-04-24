fun main() {
    println(maxProduct(intArrayOf(3, 4, 5, 2)))
    println(maxProduct(intArrayOf(1, 5, 4, 5)))
    println(maxProduct(intArrayOf(3, 7)))
}

fun maxProduct(nums: IntArray): Int {
//    var length = nums.size - 1
//
//    while (length > 0) {
//        for (i in 0..<length) {
//            val left = nums[i]
//            val right = nums[i + 1]
//
//            if (left > right) {
//                nums[i] = right
//                nums[i + 1] = left
//            }
//        }
//
//        length--
//    }

    nums.sort()

    return (nums.last() - 1) * (nums[nums.size - 2] - 1)
}