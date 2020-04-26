package easy

/**
 * https://leetcode.com/problems/palindrome-number/
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

fun main() {
    println(isPalindrome2(121))
    println(isPalindrome2(123321))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false    // 小於零

    val intList: ArrayList<Int> = ArrayList()
    var y = x

    while (y > 0) {
        intList.add(y % 10)
        y /= 10
    }

    val intList2: ArrayList<Int> = ArrayList()
    for (i in 0 until intList.size) {
        intList2.add(intList[intList.size - i - 1])
    }

    return intList.equals(intList2)
}

fun isPalindrome2(x: Int): Boolean {
    if (x < 0) return false    // 小於零

    var x2 = x
    var revertedNumber = 0
    while (x2 > 0) {
        revertedNumber = revertedNumber * 10 + x2 % 10
        x2 /= 10
    }

    return x == revertedNumber
}