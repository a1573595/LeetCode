package easy

import kotlin.system.measureTimeMillis

/**
 * climbing-stairs
 * https://leetcode.com/problems/climbing-stairs/
 * Successione di Fibonacci（費氏數列）
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(getClimbing(45))
    }

    val costTimeMillis2 = measureTimeMillis {
        println(getClimbing2(45))
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 使用遞迴計算答案
 */
fun getClimbing(stair: Int): Int {
    return when {
        stair < 1 -> 0
        stair == 1 -> 1
        stair == 2 -> 2
        else -> getClimbing(stair - 1) + getClimbing(stair - 2)
    }
}

/**
 * 使用陣列儲存計算結果，減少不必要的開銷
 * 使用last速度會比直接指定還慢
 */
fun getClimbing2(stair: Int): Int {
    return when {
        stair < 1 -> 0
        stair == 1 -> 1
        stair == 2 -> 2
        else -> {
            val steps = IntArray(stair)
            steps[0] = 1
            steps[1] = 2

            for (i in 2 until stair) {
                steps[i] = steps[i - 1] + steps[i - 2]
            }

//            steps.last()
            steps[stair - 1]
        }
    }
}