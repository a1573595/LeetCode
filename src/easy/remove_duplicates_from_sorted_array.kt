package easy

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

fun main() {
    println(removeDuplicates(intArrayOf(0, 1)))  // [0, 1]   2
    println(removeDuplicates(intArrayOf(1, 1, 2)))  // [1, 2]   2
    println(removeDuplicates(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
    println(removeDuplicates(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
    println()
    println()
    println(removeDuplicates2(intArrayOf(0, 1)))  // [0, 1]   2
    println(removeDuplicates2(intArrayOf(1, 1, 2)))  // [1, 2]   2
    println(removeDuplicates2(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
    println(removeDuplicates2(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
    println(removeDuplicates2(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
    println()
    println()
    println(removeDuplicates3(intArrayOf(0, 1)))  // [0, 1]   2
    println(removeDuplicates3(intArrayOf(1, 1, 2)))  // [1, 2]   2
    println(removeDuplicates3(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
    println(removeDuplicates3(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
    println(removeDuplicates3(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
}

// 未移除重複元素
fun removeDuplicates(nums: IntArray): Int {
    val intSet: MutableSet<Int> = mutableSetOf()
    nums.forEach { intSet.add(it) }

    return intSet.size
}

// 未移除重複元素
fun removeDuplicates2(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var count = 1
    var num = nums[0]

    for (i in 1 until nums.size) {
        if (num != nums[i]) {
            num = nums[i]
            count++
        }
    }

    return count
}

fun removeDuplicates3(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var count = 1
    var index = 0

    for (i in 1 until nums.size) {
        if (nums[index] < nums[i]) {
            nums[++index] = nums[i]
            count++
        }
    }

    return count
}