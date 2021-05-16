package easy

import kotlin.system.measureTimeMillis

/**
 * remove-duplicates-from-sorted-array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(removeDuplicates(intArrayOf(0, 1)))  // [0, 1]   2
        println(removeDuplicates(intArrayOf(1, 1, 2)))  // [1, 2]   2
        println(removeDuplicates(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
        println(removeDuplicates(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
        println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(removeDuplicates2(intArrayOf(0, 1)))  // [0, 1]   2
        println(removeDuplicates2(intArrayOf(1, 1, 2)))  // [1, 2]   2
        println(removeDuplicates2(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
        println(removeDuplicates2(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
        println(removeDuplicates2(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(removeDuplicates3(intArrayOf(0, 1)))  // [0, 1]   2
        println(removeDuplicates3(intArrayOf(1, 1, 2)))  // [1, 2]   2
        println(removeDuplicates3(intArrayOf(1, 2, 3)))  // [1, 2, 3]   3
        println(removeDuplicates3(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
        println(removeDuplicates3(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
}

/**
 * 使用Set特性移除重複的元素
 */
fun removeDuplicates(nums: IntArray): Int {
    val intSet: MutableSet<Int> = mutableSetOf()
    nums.forEach { intSet.add(it) }

    return intSet.size
}

/**
 * 因資料已有經過排序
 * 使用迴圈判斷是否相等效能更好
 */
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

/**
 * 除了計算不重複的元素外
 * 仍需調整傳入陣列的內容才算完成
 */
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