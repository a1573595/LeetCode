package easy

import kotlin.system.measureTimeMillis

// https://leetcode.com/problems/search-insert-position/

fun main(args: Array<String>) {
    val costTimeMillis1 = measureTimeMillis {
        println(searchInsert(intArrayOf(1, 3, 5, 6), 5))    // 2
        println(searchInsert(intArrayOf(1, 3, 5, 6), 2))    // 1
        println(searchInsert(intArrayOf(1, 3, 5, 6), 7))    // 4
        println(searchInsert(intArrayOf(1, 3, 5, 6), 0))    // 0
    }

    val costTimeMillis2 = measureTimeMillis {
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 5))    // 2
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 2))    // 1
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 7))    // 4
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 0))    // 0
    }

    println(costTimeMillis1)
    println(costTimeMillis2)
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var position = 0

    for(n in nums) {
        if(n < target) {
            position++
        }
    }

    return position
}

fun searchInsert2(nums: IntArray, target: Int): Int {
    var position = 0

    for(n in nums) {
        if(n < target) {
            position++
        } else {
            break
        }
    }

    return position
}