package easy

import kotlin.system.measureTimeMillis

// https://leetcode.com/problems/climbing-stairs/

fun main() {
    val costTimeMillis1 = measureTimeMillis {
        getClimbing(45)
    }

    val costTimeMillis2 = measureTimeMillis {
        getClimbing2(45)
    }

    println(costTimeMillis1)
    println(costTimeMillis2)
}

fun getClimbing(stair: Int): Int {
    return when {
        stair < 1 -> 0
        stair == 1 -> 1
        stair == 2 -> 2
        else -> getClimbing(stair - 1) + getClimbing(stair - 2)
    }
}

fun getClimbing2(stair: Int): Int {
    return when {
        stair < 1 -> 0
        stair == 1 -> 1
        else -> {
            val dp = IntArray(stair + 1)
            dp[1] = 1
            dp[2] = 2
            for (i in 3..stair) {
                dp[i] = dp[i - 1] + dp[i - 2]
            }

            dp[stair]
        }
    }
}