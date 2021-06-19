package easy

import java.util.HashMap
import kotlin.system.measureTimeMillis

/**
 * two-sum2
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(twoSum2_1(intArrayOf(0, 1, 2, 7, 11, 15), 9).joinToString()) // 3, 4
        println(twoSum2_1(intArrayOf(2, 7, 11, 15), 9).joinToString()) // 1, 2
        println(twoSum2_1(intArrayOf(2, 3, 4), 6).joinToString())  // 1, 3
        println(twoSum2_1(intArrayOf(-1, 0), -1).joinToString()) // 1, 2
        println(twoSum2_1(intArrayOf(3, 3), 6).joinToString()) // 1, 2
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(twoSum2_2(intArrayOf(0, 1, 2, 7, 11, 15), 9).joinToString()) // 3, 4
        println(twoSum2_2(intArrayOf(2, 7, 11, 15), 9).joinToString()) // 1, 2
        println(twoSum2_2(intArrayOf(2, 3, 4), 6).joinToString())  // 1, 3
        println(twoSum2_2(intArrayOf(-1, 0), -1).joinToString()) // 1, 2
        println(twoSum2_2(intArrayOf(3, 3), 6).joinToString()) // 1, 2
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 透過Map尋找對應數字
 */
fun twoSum2_1(numbers: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in numbers.indices) {
        map[numbers[i]] = i
    }
    for (i in numbers.indices) {
        val complement = target - numbers[i]
        if (map.containsKey(complement) && map[complement] != i) {
            return intArrayOf(i+ 1, map[complement]!! + 1)
        }
    }
    throw IllegalArgumentException("No two sum solution")
}

/**
 * 因為陣列已經排緒過加上答案只有一組
 * 因此可以從兩側慢慢逼近找到答案
 */
fun twoSum2_2(numbers: IntArray, target: Int): IntArray {
    val answer = IntArray(2)

    var left = 0
    var right = numbers.size - 1

    while (true) {
        val sum = numbers[left] + numbers[right]
        when {
            sum < target -> left++
            sum > target -> right--
            else -> {
                answer[0] = left + 1
                answer[1] = right + 1
                break
            }
        }
    }

    return answer
}