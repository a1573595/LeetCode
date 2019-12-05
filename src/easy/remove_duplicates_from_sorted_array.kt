package easy

import kotlin.system.measureTimeMillis

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

fun main(args: Array<String>) {
    val costTimeMillis1 = measureTimeMillis {
        println(removeDuplicates(intArrayOf(1, 1, 2)))
        println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    }

    val costTimeMillis2 = measureTimeMillis {
        println(removeDuplicates2(intArrayOf(1, 1, 2)))
        println(removeDuplicates2(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    }

    println(costTimeMillis1)
    println(costTimeMillis2)
}

fun removeDuplicates(nums: IntArray): Int {
    val intSet: MutableSet<Int> = mutableSetOf()
    nums.forEach { intSet.add(it) }

    return intSet.size  // intSet.toIntArray()
}
// Error answer
fun removeDuplicates2(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}