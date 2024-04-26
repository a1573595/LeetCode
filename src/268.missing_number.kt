fun main() {
    println(missingNumber(intArrayOf(3, 0, 1)))
    println(missingNumber(intArrayOf(0, 1)))
    println(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun missingNumber(nums: IntArray): Int {
    var count = 0

    nums.forEachIndexed { index, i ->
        count -= i
        count += index + 1
    }

    return count
}
