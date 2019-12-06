package easy

// https://leetcode.com/problems/implement-strstr/

fun main(args: Array<String>) {
    println(strStr("hello", "ll"))
    println(strStr("aaaaa", "bba"))
    println(strStr("", ""))
    println(strStr("aaa", "aaaa"))

    println(strStr2("hello", "ll"))
    println(strStr2("aaaaa", "bba"))
    println(strStr2("", ""))
    println(strStr("aaa", "aaaa"))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

fun strStr2(haystack: String, needle: String): Int {
    if(needle.isEmpty()) return 0

    for(i in haystack.indices) {
        if(i + needle.length > haystack.length) {
            break
        }else if(haystack[i] == needle[0] && haystack.substring(i, i + needle.length) == needle) {
            return i
        }
    }

    return -1
}