package easy

import java.util.*
import kotlin.system.measureTimeMillis

/**
 * two-sum
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString())
        println(twoSum(intArrayOf(3, 2, 4), 6).joinToString())
        println(twoSum(intArrayOf(3, 3), 6).joinToString())
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(twoSum2(intArrayOf(2, 7, 11, 15), 9).joinToString())
        println(twoSum2(intArrayOf(3, 2, 4), 6).joinToString())
        println(twoSum2(intArrayOf(3, 3), 6).joinToString())
    }

    println()
    println()

    val costTimeMillis3 = measureTimeMillis {
        println(twoSum3(intArrayOf(2, 7, 11, 15), 9).joinToString())
        println(twoSum3(intArrayOf(3, 2, 4), 6).joinToString())
        println(twoSum3(intArrayOf(3, 3), 6).joinToString())
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
    println("fun3: $costTimeMillis3")
}

/**
 * 透過indexOf尋找對應數字
 * 但會找到自己本身而導致結果錯誤！
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    var lastIndex: Int

    for (i in nums.indices) {
        lastIndex = nums.indexOf(target - nums[i])
        if (lastIndex != -1 && lastIndex != i) {
            return intArrayOf(i, lastIndex)
        }
    }

    return intArrayOf()
}

/**
 * 透過雙層迴圈找到對應數字
 */
fun twoSum2(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (target == nums[i] + nums[j]) {
                return intArrayOf(i, j)
            }
        }
    }

    throw IllegalArgumentException("No two sum solution")
}

/**
 *
 */
fun twoSum3(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        map[nums[i]] = i
    }
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement) && map[complement] != i) {
            return intArrayOf(i, map[complement]!!)
        }
    }
    throw IllegalArgumentException("No two sum solution")
}