package easy

import kotlin.system.measureTimeMillis

/**
 * plus-one
 * https://leetcode.com/problems/plus-one/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(plusOne(intArrayOf(1, 2, 3)).contentToString())
        println(plusOne(intArrayOf(4, 3, 2, 1)).contentToString())
        println(plusOne(intArrayOf(0)).contentToString())
        println(plusOne(intArrayOf(9, 9)).contentToString())
        println(plusOne(intArrayOf(8, 9, 9, 9)).contentToString())
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
}

/**
 * 結尾+1再判斷是否進位
 */
fun plusOne(digits: IntArray): IntArray {
    digits[digits.size - 1] += 1

    for (i in digits.size - 1 downTo 0) {
        if (digits[i] > 9) {
            digits[i] = 0

            if (i > 0) {
                digits[i - 1] += 1
            } else {
                return intArrayOf(1) + digits
            }
        } else {
            break
        }
    }

    return digits
}