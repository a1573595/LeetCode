package easy

// https://leetcode.com/problems/longest-common-prefix/

fun main(args: Array<String>) {
    println(longestCommonPrefix(arrayOf()))
    println()
    println(longestCommonPrefix(arrayOf("","")))
    println()
    println(longestCommonPrefix(arrayOf("c","c")))
    println()
    println(longestCommonPrefix(arrayOf("aa","aa")))
    println()
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println()
    println(longestCommonPrefix(arrayOf("a","b")))
    println()
}

fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.isEmpty() || strs[0].isEmpty()) return ""   // 空陣列、空字串

    for(i in strs[0].indices) {
        val str = strs[0][i]

        for(j in 1 until strs.size)
            if(strs[j].length == i || strs[j][i] != str)
                return strs[0].substring(0, i)
    }

    return strs[0]
}

fun longestCommonPrefix2(strs: Array<String>): String? {
    if (strs.isEmpty()) return ""
    
    for (i in strs[0].indices) {
        val c = strs[0][i]
        for (j in 1 until strs.size) {
            if (i == strs[j].length || strs[j][i] != c) {
                return strs[0].substring(0, i)
            }
        }
    }
    return strs[0]
}