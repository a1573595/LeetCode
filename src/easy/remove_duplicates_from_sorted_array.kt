package easy

import kotlin.system.measureTimeMillis

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

fun main(args: Array<String>) {
    println(removeDuplicates(intArrayOf(1, 1, 2)))  // [1, 2]   2
    println(removeDuplicates(intArrayOf(1, 1, 2, 2, 3, 4))) // [1, 2, 3, 4]   4
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // [0, 1, 2, 3, 4]   5
}

//fun removeDuplicates(nums: IntArray): Int {
//    val intSet: MutableSet<Int> = mutableSetOf()
//    nums.forEach { intSet.add(it) }
//
//    return intSet.size  // intSet.toIntArray()
//}

fun removeDuplicates(nums: IntArray): Int {
    var index = 0

    for (i in 1 until nums.size) {
        if(nums[index] != nums[i]) {
            nums[++index] = nums[i]
        }
    }

    return index + 1
}