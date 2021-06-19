package easy

import kotlin.system.measureTimeMillis

/**
 * longest-common-prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */

fun main() {
    val costTimeMillis = measureTimeMillis {
        println(longestCommonPrefix(arrayOf())) //
        println(longestCommonPrefix(arrayOf("", "")))   //
        println(longestCommonPrefix(arrayOf("c", "c"))) // c
        println(longestCommonPrefix(arrayOf("aa", "aa")))   // aa
        println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))   // fl
        println(longestCommonPrefix(arrayOf("a", "b"))) //
    }

    println()
    println()

    println("Cost timeMillis:")
    println("fun: $costTimeMillis")
}

/**
 * 從第一個位元開始比對SubString即可
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    for (i in strs[0].indices) {
        val str = strs[0][i]

        for (j in 1 until strs.size) {
            if (strs[j].length == i || strs[j][i] != str) {
                return strs[0].substring(0, i)
            }
        }
    }

    return strs[0]
}