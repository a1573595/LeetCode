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
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(firstMissingPositive2(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive2(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive2(intArrayOf(1, 2, 0)))  // 3
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(firstMissingPositive3(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive3(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive3(intArrayOf(1, 2, 0)))  // 3
    }

    println()
    println()

    val costTimeMillis4 = measureTimeMillis {
        println(firstMissingPositive4(intArrayOf(1, 2, 3)))  // 4
        println(firstMissingPositive4(intArrayOf(-1, -3)))   // 1
        println(firstMissingPositive4(intArrayOf(1, 2, 0)))  // 3
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
    println("fun4: $costTimeMillis4")
}

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

fun firstMissingPositive2(nums: IntArray): Int {
    val list: MutableList<Int> = mutableListOf()

    nums.forEach {
        if (it > 0) {
            list.add(it)
        }
    }

    list.sort()

    if (list.isNotEmpty()) {
        for (i in 1..nums.size + 1) {
            println(i)
            if (!list.contains(i)) {
                println(i)
                return i
            }
        }
    }

    return 1
}

fun firstMissingPositive3(nums: IntArray): Int {
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

fun firstMissingPositive4(nums: IntArray): Int {
    nums.filter { it > 0 }.sorted()

    if (nums.isNotEmpty()) {
        for (i in 1..nums.size) {
            if (nums[i - 1] != i) {
                return i
            }
        }
    }

    return 1
}