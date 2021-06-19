package easy

import kotlin.system.measureTimeMillis

/**
 * first-missing-positive
 * https://leetcode.com/problems/first-missing-positive/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(firstMissingPositive(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive(intArrayOf(1, 2, 0)))  // 3
        println(firstMissingPositive(intArrayOf(3, 4, -1, 1)))  // 2
        println(firstMissingPositive(intArrayOf(7, 8, 9, 10, 11, 12)))  // 1
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(firstMissingPositive2(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive2(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive2(intArrayOf(1, 2, 0)))  // 3
        println(firstMissingPositive2(intArrayOf(3, 4, -1, 1)))  // 2
        println(firstMissingPositive2(intArrayOf(7, 8, 9, 10, 11, 12)))  // 1
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(firstMissingPositive3(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive3(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive3(intArrayOf(1, 2, 0)))  // 3
        println(firstMissingPositive3(intArrayOf(3, 4, -1, 1)))  // 2
        println(firstMissingPositive3(intArrayOf(7, 8, 9, 10, 11, 12)))  // 1
    }

    println()
    println()

    val costTimeMillis4 = measureTimeMillis {
        println(firstMissingPositive4(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive4(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive4(intArrayOf(1, 2, 0)))  // 3
        println(firstMissingPositive4(intArrayOf(3, 4, -1, 1)))  // 2
        println(firstMissingPositive4(intArrayOf(7, 8, 9, 10, 11, 12)))  // 1
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
    println("fun4: $costTimeMillis4")
}

/**
 * 去除小於1的數值
 * 從1開始尋找陣列中不存在的數值
 */
fun firstMissingPositive(nums: IntArray): Int {
    val list: MutableList<Int> = mutableListOf()

    nums.forEach {
        if (it > 0) {
            list.add(it)
        }
    }

    if (list.isEmpty()) return 1

    for (i in 1..Int.MAX_VALUE) {
        if (!list.contains(i)) {
            return i
        }
    }

    return 1
}

/**
 * 與1式相同
 * 差別在於Set能過濾重複元素且效率較快
 */
fun firstMissingPositive2(nums: IntArray): Int {
    val intSet: MutableSet<Int> = mutableSetOf()

    nums.forEach {
        if (it > 0) {
            intSet.add(it)
        }
    }

    if (intSet.isNotEmpty()) {
        for (i in 1..nums.size + 1) {
            if (!intSet.contains(i)) {
                return i
            }
        }
    }

    return 1
}

/**
 * 去除小於1的數值
 * 排序陣列
 * 從1開始尋找陣列中不存在的數值
 */
fun firstMissingPositive3(nums: IntArray): Int {
    val list: MutableList<Int> = mutableListOf()

    nums.forEach {
        if (it > 0) {
            list.add(it)
        }
    }

    list.sort()

    var i = 1
    list.forEach {
        if (i != it) {
            return i
        }
        i++
    }
    return i
}

/**
 * 與3式相同
 * 但採用Kotlin語法糖後效率變低
 */
fun firstMissingPositive4(nums: IntArray): Int {
    val list = nums.filter { it > 0 }
    list.sorted()

    var i = 1
    list.forEach {
        if (i != it) {
            return i
        }
        i++
    }
    return i
}