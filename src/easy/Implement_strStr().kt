package easy

/**
 * https://leetcode.com/problems/implement-strstr/
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

fun main() {
    println(strStr("hello", "ll"))
    println(strStr("aaaaa", "bba"))
    println(strStr("", ""))
    println(strStr("aaa", "aaaa"))
    println()
    println()
    println(strStr2("hello", "ll"))
    println(strStr2("aaaaa", "bba"))
    println(strStr2("", ""))
    println(strStr("aaa", "aaaa"))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

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