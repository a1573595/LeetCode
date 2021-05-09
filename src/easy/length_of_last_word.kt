package easy

import kotlin.system.measureTimeMillis

/**
 * length-of-last-word
 * https://leetcode.com/problems/length-of-last-word/
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
//

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(lengthOfLastWord("Hello World"))    // 5
        println(lengthOfLastWord("Today is a nice day"))  // 3
        println(lengthOfLastWord("a "))  // 1
        println(lengthOfLastWord("  "))  // 0
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(lengthOfLastWord2("Hello World"))    // 5
        println(lengthOfLastWord2("Today is a nice day"))  // 3
        println(lengthOfLastWord2("a "))  // 1
        println(lengthOfLastWord2("  "))  // 0
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 分割字串並排除空字串
 */
fun lengthOfLastWord(str: String): Int {
    if (str.isEmpty()) return 0

    val array = str.split(" ")

    for (i in array.size - 1 downTo 0) {
        if (array[i].isNotEmpty() && array[i].isNotBlank()) {
            return array[i].length
        }
    }

    return 0
}

/**
 * 從尾端開始找
 * 遇到空字串跳過
 * 直到找到非空字串為止
 */
fun lengthOfLastWord2(str: String): Int {
    var count = 0

    for (i in str.length - 1 downTo 0) {
        if (count == 0 && str[i] == ' ') {
            continue
        } else if (str[i] != ' ') {
            count++
        } else {
            break
        }
    }

    return count
}