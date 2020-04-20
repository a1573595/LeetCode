package easy

import kotlin.system.measureTimeMillis

// https://leetcode.com/problems/valid-anagram/

fun main() {
    val costTimeMillis1 = measureTimeMillis {
        isAnagram1("anagram", "nagaram")
    }

    val costTimeMillis2 = measureTimeMillis {
        isAnagram2("anagram", "nagaram")
    }

    println(costTimeMillis1)
    println(costTimeMillis2)
}

fun isAnagram1(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val charMap1: MutableMap<Char, Int> = mutableMapOf()
    val charMap2: MutableMap<Char, Int> = mutableMapOf()

    for (c in str1)
        if (charMap1.containsKey(c)) {
            charMap1[c] = charMap1[c]!! + 1
        } else
            charMap1[c] = 1

    for (c in str2)
        if (charMap2.containsKey(c)) {
            charMap2[c] = charMap2[c]!! + 1
        } else
            charMap2[c] = 1

    return charMap1 == charMap2
}

fun isAnagram2(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val charArray1 = str1.toCharArray()
    val charArray2 = str2.toCharArray()

    charArray1.sort()
    charArray2.sort()

    return charArray1.contentEquals(charArray2)
}