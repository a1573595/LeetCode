package medium

import kotlin.system.measureTimeMillis

/**
 * Water and Jug Problem
 * https://leetcode.com/problems/water-and-jug-problem/
 */
fun main() {
    val costTimeMillis = measureTimeMillis {
        println(canMeasureWater(3, 5, 4)) // true
        println(canMeasureWater(2, 6, 5)) // false
        println(canMeasureWater(1, 2, 3)) // true
        println(canMeasureWater(34, 5, 6)) // true
        println(canMeasureWater(1, 1, 12)) // false
        println(canMeasureWater(13, 11, 1)) // true
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(canMeasureWater2(3, 5, 4)) // true
        println(canMeasureWater2(2, 6, 5)) // false
        println(canMeasureWater2(1, 2, 3)) // true
        println(canMeasureWater2(34, 5, 6)) // true
        println(canMeasureWater2(1, 1, 12)) // false
        println(canMeasureWater2(13, 11, 1)) // true
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

// 若target無法被jug1、jug2、jug1+jug2、jug1-jug2、jug1%jug2整除則為false
fun canMeasureWater(jug1Capacity: Int, jug2Capacity: Int, targetCapacity: Int): Boolean {
    val resolve = intArrayOf(
        jug1Capacity,
        jug2Capacity,
        jug1Capacity + jug2Capacity,
//        if (jug1Capacity > jug2Capacity) jug1Capacity - jug2Capacity else jug2Capacity - jug1Capacity,
        if (jug1Capacity > jug2Capacity) jug1Capacity % jug2Capacity else jug2Capacity % jug1Capacity,
        if (jug1Capacity > jug2Capacity) jug2Capacity - jug1Capacity % jug2Capacity else jug1Capacity - jug2Capacity % jug1Capacity
    )

    if (resolve[2] < targetCapacity) return false

    resolve.forEach {
        if (it > 0 && targetCapacity % it == 0) {
            return true
        }
    }

    return false
}

/**
 * 思路：最大公因數
 * https://www.cnblogs.com/grandyang/p/5628836.html
 */
fun canMeasureWater2(jug1Capacity: Int, jug2Capacity: Int, targetCapacity: Int): Boolean {
    return targetCapacity == 0 || jug1Capacity + jug2Capacity >= targetCapacity && targetCapacity % gcd(
        jug1Capacity,
        jug2Capacity
    ) == 0
}

fun gcd(x: Int, y: Int): Int {
    return if (y == 0) x else gcd(y, x % y)
}