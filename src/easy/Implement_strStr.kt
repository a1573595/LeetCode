package easy

import kotlin.system.measureTimeMillis

/**
 * implement-strstr
 * https://leetcode.com/problems/implement-strstr/
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(strStr("hello", "ll"))  // 2
        println(strStr("aaaaa", "bba")) // -1
        println(strStr("", "")) // 0
        println(strStr("aaa", "aaaa"))  // -1
    }

    println()
    println()

    val costTimeMillis2 = measureTimeMillis {
        println(strStr2("hello", "ll"))
        println(strStr2("aaaaa", "bba"))
        println(strStr2("", ""))
        println(strStr2("aaa", "aaaa"))
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
    println("fun2: $costTimeMillis2")
}

/**
 * 使用預設函式indexOf
 */
fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

/**
 * 排除空字串為0
 * 透過迴圈尋找子字串是否符合結果
 * 並排除小於長度的字串
 */
fun strStr2(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0

    for (i in haystack.indices) {
        if (i + needle.length > haystack.length) {
            break
        } else if (haystack.substring(i, i + needle.length) == needle) {
            return i
        }
    }

    return -1
}