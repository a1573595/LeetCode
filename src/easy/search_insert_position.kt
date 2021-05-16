package easy

import kotlin.system.measureTimeMillis

/**
 * search-insert-position
 * https://leetcode.com/problems/search-insert-position/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(searchInsert(intArrayOf(1, 3, 5, 6), 5))    // 2
        println(searchInsert(intArrayOf(1, 3, 5, 6), 2))    // 1
        println(searchInsert(intArrayOf(1, 3, 5, 6), 7))    // 4
        println(searchInsert(intArrayOf(1, 3, 5, 6), 0))    // 0
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 5))    // 2
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 2))    // 1
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 7))    // 4
        println(searchInsert2(intArrayOf(1, 3, 5, 6), 0))    // 0
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 依序搜尋尋找插入位置
 */
fun searchInsert(nums: IntArray, target: Int): Int {
    var position = 0

    for (n in nums) {
        if (n < target) {
            position++
        }
    }

    return position
}

/**
 * 同一
 * 找到後使用Break跳出
 */
fun searchInsert2(nums: IntArray, target: Int): Int {
    var position = 0

    for (n in nums) {
        if (n < target) {
            position++
        } else {
            break
        }
    }

    return position
}