package easy

import kotlin.system.measureTimeMillis

/**
 * count-and-say
 * https://leetcode.com/problems/count-and-say/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(countAndSay(8)) // 1113213211
        println(countAndSay(10))    // 13211311123113112211
        println(countAndSay(15))    // 311311222113111231131112132112311321322112111312211312111322212311322113212221
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(countAndSay2(8))    // 1113213211
        println(countAndSay2(10))   // 13211311123113112211
        println(countAndSay2(15))   // 3113112221131112311311121321123113213221121113122113121113222123113221132
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