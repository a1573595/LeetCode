package easy

import kotlin.system.measureTimeMillis

/**
 * count-and-say
 * https://leetcode.com/problems/count-and-say/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(countAndSay(8))
        println(countAndSay(10))
        println(countAndSay(15))
    }

    val costTimeMillis2 = measureTimeMillis {
        println(countAndSay2(8))
        println(countAndSay2(10))
        println(countAndSay2(15))
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 依序計數並保存
 */
fun countAndSay(n: Int): String {
    var sayString = "1"
    var count = 1

    for (i in 2..n) {
        val temString = sayString
        sayString = ""

        for (j in temString.indices) {
            if (j < temString.lastIndex && temString[j] == temString[j + 1]) {
                count++
            } else {
                sayString = sayString + count + temString[j]
                count = 1
            }
        }
    }


    return sayString
}

/**
 * 依序計數並保存
 * 排除題目已給的答案
 */
fun countAndSay2(n: Int): String {
    var sayString = when {
        n <= 1 -> "1"
        n == 2 -> "11"
        n == 3 -> "21"
        n == 4 -> "1211"
        else -> "111221"
    }
    var count = 1

    for (i in 6..n) {
        val temString = sayString
        sayString = ""

        for (j in temString.indices) {
            if (j < temString.lastIndex && temString[j] == temString[j + 1]) {
                count++
            } else {
                sayString = sayString + count + temString[j]
                count = 1
            }
        }
    }


    return sayString
}